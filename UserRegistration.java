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
		
	/* The below validateLastName function will check for whether it satisfy
	 * pattern if yes then it returns boolean value true for it else false
	 */
		public boolean validateLastName(String lastName) 
		{
			String pattern = "^[A-Z][a-zA-Z]{2,}";
		    return Pattern.matches(pattern, lastName);
		}
		
	/*method to validate the Email
	 * entered by the user
	 */
	    public boolean validateEmail(String email)
	    {
	        String pattern = "[a-z0-9_+-]*[.a-z0-9_+-]*?@[a-z0-9]*.[a-z]*[.a-z]*?$";
	        return Pattern.matches(pattern, email);
	    }
	
	/*method to validate the Email
	 * entered by the user
	 */
	    public boolean validatePhoneNumber(String phoneNumber)
	    {
	    	String pattern = "^[0-9]{2}\\s?[0-9]{10}$";
	        return Pattern.matches(pattern, phoneNumber);
	    }
	    
}
