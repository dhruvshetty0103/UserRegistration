package com.regex.userregistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

@RunWith(Parameterized.class)
public class UserRegistrationTesting  
{
	boolean expectedResult;
	String firstNames;
	UserRegistration obj;
	@Before 
	public void initialize()
	{
		obj=new UserRegistration();
	}
	
	public UserRegistrationTesting(String firstNames,boolean expectedResult) 
	{
		this.firstNames=firstNames;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(
				new Object[][] {
						{"Dhruv",true},
						{"Raj",true},
						{"A",false},
						{"As",false},
						{"Sad",true},
						
				});
	}
	@Test
	public void addTest() {
		assertEquals(expectedResult, obj.validateFirstName(firstNames));
	}
}

