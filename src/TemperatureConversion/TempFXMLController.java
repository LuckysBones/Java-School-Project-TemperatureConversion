package TemperatureConversion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author		Luc Gremillion, S02597411
 * @version		2022-3-29, CSC-240 Assignment 8
 */
public class TempFXMLController implements Initializable {

/**
 * Temperature Scale to add conversion control for the program
 */
private final TemperatureScale convert = new TemperatureScale();

/**
 * Holds the different temperature values
 */
private final String[] tempArray ={ "Fahrenheit", "Celsius", "Kelvin"};; 

/**
 * Text Field One for the user to enter or receive the temperature
 */
@FXML
private TextField txtTempOne;

/**
 * Text Field Two for the user to enter or receive the temperature
 */
@FXML
private TextField txtTempTwo;

/**
 * Choice Box One for the user to let the program know which temperature they want 
 */
@FXML
private ChoiceBox<String> cmbTempOne = new ChoiceBox();

/**
 * Choice Box Two for the user to let the program know which temperature they want 
 */
@FXML
private ChoiceBox<String> cmbTempTwo = new ChoiceBox();

/**
 * Label severs as the title for the program, also when the user reaches an 
 * error the error will be displayed here and updated back the title when error is fixed
 */
@FXML
private Label lblTitle;

/**
 * Label to show to user if the text box they are in is the 
 * from or to, this one is set to "To" as its default
 */
@FXML
private Label lblTo;

/**
 * Label to show to user if the text box they are in is the 
 * from or to, this one is set to "From" as its default
 */
@FXML
private Label lblFrom;

/**
 * Initializes the controller class.
 * 
 * @param url
 * @param rb
 */
@Override
public void initialize(URL url, ResourceBundle rb) {
    lblTo.setText("To");
    lblFrom.setText("From");
    cmbTempOne.getItems().addAll(tempArray);
    cmbTempTwo.getItems().addAll(tempArray);
    txtTempOne.setText("0");
    txtTempTwo.setText("0");
}  

/**
* Once a key has been pressed the Window will updated
*
* @param event                      key event(not used)
*/
@FXML
private void tempTwoChanged(KeyEvent event) {
    try{
        lblTo.setText("From");
        lblFrom.setText("To");
        lblTitle.setText("Temperature Conversion");
        txtTempOne.setText(" ");
        boxTwo(); 
    }catch(NumberFormatException ex ){
        lblTitle.setText("Please enter a number: i.e 14.5 C");
    }catch(IllegalStateException ex){
        lblTitle.setText("The Input cannot be below absolute zero");
    }
}

/**
* Once a key has been pressed the Window will updated
*
* @param event                     key event (not used)
*/
@FXML
private void tempOneChanged(KeyEvent event)  {
    try{
        lblTo.setText("To");
        lblFrom.setText("From");
        lblTitle.setText("Temperature Conversion");
        txtTempTwo.setText(" ");
        boxOne();
    }catch(NumberFormatException ex ){
        lblTitle.setText("Please enter a number: i.e 14.5 C");
    }catch(IllegalStateException ex){
        lblTitle.setText("The Input cannot be below absolute zero");
    }
}

/**
 * Controls and updates the screen with the converted temperature
 */
private void boxOne() {
    if ("Celsius".equals(cmbTempOne.getValue())){
        
        convert.setCeluis(Double.parseDouble(txtTempOne.getText()));
        if(!convert.isZeroCelsius()){
            throw new IllegalStateException();
        }else if("Fahrenheit".equals(cmbTempTwo.getValue())){
            txtTempTwo.setText(Double.toString(roundTemperature(convert.grabCtoF())));
        }else if("Kelvin".equals(cmbTempTwo.getValue())){
            txtTempTwo.setText(Double.toString(roundTemperature(convert.grabCtoK())));
        }else{
            txtTempTwo.setText(txtTempOne.getText());
        }  
    }else if ("Kelvin".equals(cmbTempOne.getValue())){
        
        convert.setKelvin(Double.parseDouble(txtTempOne.getText()));
        if(!convert.isZeroKelvin()){
            throw new IllegalStateException();
        }else if("Fahrenheit".equals(cmbTempTwo.getValue())){
            txtTempTwo.setText(Double.toString(roundTemperature(convert.grabKtoF())));
        }else if("Celsius".equals(cmbTempTwo.getValue())){
            txtTempTwo.setText(Double.toString(roundTemperature(convert.grabKtoC())));
        }else{
            txtTempTwo.setText(txtTempOne.getText());
        } 
    }else if ("Fahrenheit".equals(cmbTempOne.getValue())){
        
        convert.setFahrenheit(Double.parseDouble(txtTempOne.getText()));
        if(!convert.isZeroKelvin()){
            throw new IllegalStateException();
        }else if("Kelvin".equals(cmbTempTwo.getValue())){
            txtTempTwo.setText(Double.toString(roundTemperature(convert.grabFtoK())));
        }else if("Celsius".equals(cmbTempTwo.getValue())){
             txtTempTwo.setText(Double.toString(roundTemperature(convert.grabFtoC())));
        }else{
            txtTempTwo.setText(txtTempOne.getText());
        } 
    }else{
        txtTempTwo.setText(txtTempOne.getText());
    }
}

/**
 * Controls and updates the screen with the converted temperature
 */
private void boxTwo(){
    if ("Celsius".equals(cmbTempTwo.getValue())){
        
        convert.setCeluis(Double.parseDouble(txtTempTwo.getText()));
        if(!convert.isZeroCelsius()){
            throw new IllegalStateException();
        }else if("Fahrenheit".equals(cmbTempOne.getValue())){
            txtTempOne.setText(Double.toString(roundTemperature(convert.grabCtoF())));
        }else if("Kelvin".equals(cmbTempOne.getValue())){
            txtTempOne.setText(Double.toString(roundTemperature(convert.grabCtoK())));
        }else{
            txtTempOne.setText(txtTempTwo.getText());
        }  
    }else if ("Kelvin".equals(cmbTempTwo.getValue())){
        
        convert.setKelvin(Double.parseDouble(txtTempTwo.getText()));
        if(!convert.isZeroKelvin()){
            throw new IllegalStateException();
        }else if("Fahrenheit".equals(cmbTempOne.getValue())){
            txtTempOne.setText(Double.toString(roundTemperature(convert.grabKtoF())));
        }else if("Celsius".equals(cmbTempOne.getValue())){
            txtTempOne.setText(Double.toString(roundTemperature(convert.grabKtoC())));
        }else{
            txtTempOne.setText(txtTempTwo.getText());
        } 
    }else if ("Fahrenheit".equals(cmbTempTwo.getValue())){
        
        convert.setFahrenheit(Double.parseDouble(txtTempTwo.getText()));
        if(!convert.isZeroKelvin()){
            throw new IllegalStateException();
        }else if("Kelvin".equals(cmbTempOne.getValue())){
            txtTempOne.setText(Double.toString(roundTemperature(convert.grabFtoK())));
        }else if("Celsius".equals(cmbTempOne.getValue())){
             txtTempOne.setText(Double.toString(roundTemperature(convert.grabFtoC())));
        }else{
            txtTempOne.setText(txtTempTwo.getText());
        } 
    }else{
        txtTempOne.setText(txtTempTwo.getText());
    }
}

/**
 * rounds the number given back from the Temperature Scale class
 */
private double roundTemperature(double rounded){
    BigDecimal roundNumber = new BigDecimal(Double.toString(rounded));
    roundNumber = roundNumber.setScale(2, RoundingMode.HALF_UP);
    return roundNumber.doubleValue();
}
}
