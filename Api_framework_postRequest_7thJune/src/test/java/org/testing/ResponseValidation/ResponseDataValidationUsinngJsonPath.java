package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.path.json.config.JsonPathConfig;
import com.jayway.restassured.response.Response;

public class ResponseDataValidationUsinngJsonPath					//class for Response Data Validation Usinng JsonPath
{
	public static void ResponseDataValidation(String expecteddata,Response res,String Jsonpath)		//here we required and we are giving expeced data ,response object and that response object will fetch actual data from jsonpath
	{
		String actualData=res.jsonPath().get(Jsonpath);									//here we have fetch the actual data after hitting the post request response ..and response object will fetch the actual data from jsonpath file
		Assert.assertEquals(actualData, expecteddata,"Data is not matching");					//comparison
	}
}
