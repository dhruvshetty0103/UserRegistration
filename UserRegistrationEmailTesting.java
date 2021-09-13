package com.regex.userregistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

@RunWith(Parameterized.class)
public class UserRegistrationEmailTesting  
{
	boolean expectedResult;
	String email;
	UserRegistration obj;
	@Before 
	public void initialize()
	{
		obj=new UserRegistration();
	}
	
	public UserRegistrationEmailTesting(String email,boolean expectedResult) 
	{
		this.email=email;
		this.expectedResult=expectedResult;
	}
	
	
	@Parameterized.Parameters
	public static Collection<Object[]> input()
	{
		return Arrays.asList(
				new Object[][] {
						{"abc@yahoo.com",true},//here passing some test cases for first names and expected results
						{"abc-100@yahoo.com",true},
						{"abc.100@yahoo.com",true},
						{"abc111@abc.com",true},
						{"abc-100@abc.net",true},
						{"abc.100@abc.com.au",true},
						{"abc@1.com",true},
						{"abc@gmail.com.com",true},
						{"abc+100@gmail.com",true},
						
				});
	}
	
	@Test
	public void addTest2() {
		assertEquals(expectedResult, obj.validateEmail(email));
	}
}

