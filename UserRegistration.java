package com.regex.userregistration;

import java.util.regex.Pattern;

public class UserRegistration 
{
		public boolean validateFirstName(String firstName) 
		{
			String pattern = "^[A-Z][a-zA-Z]{2,}";
	        return Pattern.matches(pattern, firstName);
		}
}
