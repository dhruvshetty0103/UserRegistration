package com.regex.userregistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

@RunWith(Parameterized.class)
public class UserRegistrationPhoneNumberTesting
{
	boolean expectedResult;
	String phoneNumber;
	UserRegistration obj;
	@Before
	public void initialize()
	{
		obj=new UserRegistration();
	}

	public UserRegistrationPhoneNumberTesting(String phoneNumber,boolean expectedResult)
	{
		this.phoneNumber=phoneNumber;
		this.expectedResult=expectedResult;
	}


	@Parameterized.Parameters
	public static Collection<Object[]> input()
	{
		return Arrays.asList(
				new Object[][] {
						{"917574068586",true},//here passing some test cases for first names and expected results
						{"91 7574068586",true},
						{"7574068586",false},
						{"75740",false},
						{"Sad",false},
						{"abc@bl.co",false}

				});
	}

	@Test
	public void addTest2() {
		assertEquals(expectedResult, obj.validatePhoneNumber(phoneNumber));
	}
}
