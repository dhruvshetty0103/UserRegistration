package com.regex.userregistration;

import java.util.regex.Pattern;

public class UserRegistration 
{
	/* The below validateFirstName function will check for whether it satisfy
	 * pattern if yes then it returns boolean value true for it else false
	 */
		public boolean validateFirstName(String firstName) 
		{
			String pattern = "^[A-Z][a-zA-Z]{2,}";
	        return Pattern.matches(pattern, firstName);
		}
}
