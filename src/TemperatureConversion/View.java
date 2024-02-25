package TemperatureConversion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The View class will set the window and the information for the
 * window and pull its information for the application from the FXML file
 * 
 * @author		Luc Gremillion, S02597411
 * @version		2022-4-1, CSC-240 Assignment 8
 */
public class View extends Application {
   
/**
 * The minimum height for the window
 */
private static final double MINIMUM_HEIGHT = 300.0;

/**
 * The minimum width for the window
 */
private static final double MINIMUM_WIDTH = 490.0;    

/**
 * The maximum height for the window
 */
private static final double MAXIMUM_HEIGHT = 310.0;

/**
 * The maximum width for the window
 */
private static final double MAXIMUM_WIDTH = 500.0;    
/**
* Public Constructor.
*/
public View(){}

/**
 * Starts the window and FXML file to run the application
 *
 * @param stage                 the stage or window information
 * @throws  java.lang.Exception if the FXML file finds an error
 */
@Override
public void start(Stage stage) throws Exception {        
    Parent root = FXMLLoader.load(getClass().getResource("TempFXML.fxml"));
    Scene scene = new Scene(root);
    stage.setTitle("Temperature Conversion");
    stage.setMinHeight(MINIMUM_HEIGHT);
    stage.setMinWidth(MINIMUM_WIDTH);
    stage.setMaxHeight(MAXIMUM_HEIGHT);
    stage.setMaxWidth(MAXIMUM_WIDTH);
    stage.setScene(scene);
    stage.show();
}
}
