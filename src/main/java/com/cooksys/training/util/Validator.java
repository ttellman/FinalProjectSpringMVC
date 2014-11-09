/**
 * 
 */
package com.cooksys.training.util;

/**
 * @author Cooksys Teacher
 *	Apr 3, 2013 3:49:24 PM
 * 
 * @Copyright This code is intellectual property of 
 * CookSystems International. 2013
 */
public class Validator {
	
	public static void validateCountry (String country) {
		if ( !Validator.isValidCountry(country) ) {
			throw new IllegalArgumentException("Invalid country specified: " + country);
		}
	}
	
	public static boolean isValidCountry (String country) {
		boolean validCountry = true;
		if (country == null || country.trim().length() < 1) {
			validCountry = false;
		}
		return validCountry;
	}
}
