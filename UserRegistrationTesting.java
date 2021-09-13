package com.regex.userregistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
	public static Collection<Object[]> input()
	{
		return Arrays.asList(
				new Object[][] {
						{"Dhruv",true},//here passing some test cases for first names and expected results
						{"Aakriti",true},
						{"A",false},
						{"As",false},
						{"Sad",true},
						{"Vishwesh",true}
						
				});
	}
	@Test
	public void addTest() {
		assertEquals(expectedResult, obj.validateFirstName(firstNames));
	}
}

