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
						{"dhruv0103@gmail.com",true},//here passing some test cases for first names and expected results
						{"abc.xyz@bl.co.in",true},
						{"A",false},
						{"As",false},
						{"Sad",false},
						{"abc@bl.co",true}

				});
	}

	@Test
	public void addTest2() {
		assertEquals(expectedResult, obj.validateEmail(email));
	}
}

