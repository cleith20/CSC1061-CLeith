/*
 * Copyright (c) 2026 Cameron Leith
 */

import java.util.Arrays;

// this generates documentation
/**
 * Methods to convert temperature from one system to another
 * 
 * @author Cameron Leith
 * @version 1
 * 
 */
public class TempConvert {
	public final double FREEZING_TEMP_CELSIUS = 0.0;
	public final double FREEZING_TEMP_FAHRENHEIT = 32.0;
	
	/**
	 * Converts a temperature from fahrenheit to celsius
	 * @param temperature in fahrenheit
	 * @return temperature in celsius
	 */
	public static double ConvertFahToCel(double input) {
		return (input - 32) *(5.0/9.0);
	}
	/**
	 * Converts a temperature from celsius to fahrenheit
	 * @param temperature in celsius
	 * @return temperature in fahrenheit
	 */
	public static double ConvertCelToFah(double input) {
		return input *(9.0/5.0)+32;
	}
	
}
