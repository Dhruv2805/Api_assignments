package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate 													//class for Response Status Code Validate
{
	public static void ResponseStatusCode(int ExpectedStatusCode, Response res)				//here a method is created.. we are giving generic expected code and actual code comes after run
	{
		Assert.assertEquals(res.statusCode(), ExpectedStatusCode,"Status code is not matching");		//Assert is a java class..with the help of it we are comparing
																										//if status code mismatch then a comment will be displayed
	}
}
