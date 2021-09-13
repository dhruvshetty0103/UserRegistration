package com.regex.userregistration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

@RunWith(Parameterized.class)
public class UserRegistrationPasswordTesting
{
	boolean expectedResult;
	String password;
	UserRegistration obj;
	@Before
	public void initialize()
	{
		obj=new UserRegistration();
	}

	public UserRegistrationPasswordTesting(String password,boolean expectedResult)
	{
		this.password=password;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static Collection<Object[]> input()
	{
		return Arrays.asList(
				new Object[][] {
						{"917A574068586",true},//here passing some test cases for first names and expected results
						{"91D",false},
						{"dfsAdfjdgfdh",true},
						{"75740",false},
						{"aaAdsadas",true},
						{"abcb#Alsasco",true},
						{"ABCDEFG",false}
				});
	}

	@Test
	public void addTest() {
		assertEquals(expectedResult, obj.validatePasswordMinLength(password));
	}
}
