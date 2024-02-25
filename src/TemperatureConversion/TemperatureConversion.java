package TemperatureConversion;

import static javafx.application.Application.launch;


/**
 * This is the main application. Launches the View class which will run the
 * application and pull its information for the application from the FXML file.
 * 
 * This application is meant to convert one temperature
 * into another form of temperature.
 *
 * @author		Luc Gremillion, S02597411
 * @version		2022-3-29, CSC-240 Assignment 8
 */
public class TemperatureConversion {
    
/**
 * Private constructor
 */
private TemperatureConversion(){}

/**
* Main entry point.
* <p>
* Execute:</p>
* <pre>TemperatureConversion.TemperatureConversion</pre>
*
* @param args                       not used
*/
public static void main(String[] args){
    launch(View.class, args);
}
}
