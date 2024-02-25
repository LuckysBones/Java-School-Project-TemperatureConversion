package TemperatureConversion;

/**
 * Holds the information and methods needed by TempFXMLController class.
 * Will convert from one temperature to another from a value given from 
 * the TempFXMLController class.
 * 
 * @author		Luc Gremillion, S02597411
 * @version		2022-3-29, CSC-240 Assignment 8
 */
public class TemperatureScale {

/**
 * Holds the value for Fahrenheit for the conversion
 */    
private double FAHRENHEIT = 0;

/**
 * Holds the value for Celsius for the conversion
 */  
private double CELSIUS = 0;

/**
 * Holds the value for Kelvin for the conversion
 */  
private double KELVIN = 0;

/**
 * Holds the minimum value for Kelvin 
 */ 
private final double MINIMUM_KELVIN = 0;

/**
 * Holds the minimum value for Celsius 
 */ 
private final double MINIMUM_CELSIUS = -273.15;

/**
 * Holds the minimum value for Fahrenheit 
 */ 
private final double MINIMUM_FAHRENHEIT = -459.67;

/**
 * Public Constructor
 */  
public TemperatureScale(){}

/**
 * Converts Kelvin to Celsius
 * 
 * @return              converted Celsius temperature
 */ 
public double grabKtoC(){
    return CELSIUS = KELVIN - 273.15;
}

/**
 * Converts Kelvin to Fahrenheit
 * 
 * @return              converted Fahrenheit temperature
 */ 
public double grabKtoF(){
    return FAHRENHEIT = (KELVIN - 273.15) * 9/5 + 32;
}

/**
 * Converts Celsius to Kelvin
 * 
 * @return              converted Kelvin temperature
 */ 
public double grabCtoK(){
    return KELVIN = CELSIUS + 273.15;
}

/**
 * Converts Celsius to Fahrenheit
 * 
 * @return              converted Fahrenheit temperature
 */ 
public double grabCtoF(){
    return FAHRENHEIT = (CELSIUS * 9/5) + 32;
}

/**
 * Converts Fahrenheit to Kelvin
 * 
 * @return              converted Kelvin temperature
 */ 
public double grabFtoK(){
    return KELVIN = (FAHRENHEIT - 32) * 5/9 + 273.15;
}

/**
 * Converts Fahrenheit to Celsius
 * 
 * @return              converted Celsius temperature
 */
public double grabFtoC(){
    return CELSIUS = (FAHRENHEIT - 32) * 5/9;
}

/**
* sets the value for Fahrenheit 
* 
* @param fahrenheit                 value for FAHRENHEIT
*/
public void setFahrenheit(double fahrenheit){
    this.FAHRENHEIT = fahrenheit;
}

/**
* sets the value for Celsius 
* 
* @param celsius                 value for CELSIUS
*/
public void setCeluis(double celsius){
    this.CELSIUS = celsius;
}

/**
* sets the value for Kelvin 
* 
* @param kelvin                 value for KELVIN
*/
public void setKelvin(double kelvin){
    this.KELVIN = kelvin;
}

/**
* gets details of what the current input or held value for Fahrenheit
*		
* @return                                   Fahrenheit
*/
public double getFahrenheit(){
    return FAHRENHEIT;
}

/**
 * gets details of what the current input or held value for Celsius
 *		
 * @return                                  Celsius
 */
public double getCelsius(){
    return CELSIUS;
}

/**
 * gets details of what the current input or held value for Kelvin
 *		
 * @return                                  Kelvin
 */
public double getKelvin(){
    return KELVIN;
}

/**
 * Will return true or false if Kelvin value is below absolute zero
 * 
 * @return               Boolean true or false
 */
public boolean isZeroKelvin(){
    return KELVIN >= MINIMUM_KELVIN;
}

/**
 * Will return true or false if Celsius value is below absolute zero
 * 
 * @return               Boolean true or false
 */
public boolean isZeroCelsius(){
    return CELSIUS >= MINIMUM_CELSIUS;
}

/**
 * Will return true or false if Fahrenheit value is below absolute zero
 * 
 * @return               Boolean true or false
 */
public boolean isZeroFahrenheit(){
    return FAHRENHEIT >= MINIMUM_FAHRENHEIT;
}
}
