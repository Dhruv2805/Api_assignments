package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidationUsinngJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.Teststeps.Http_method;
import org.testing.utilities.JsonBodyDataLoad;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import com.jayway.restassured.response.Response;

public class PostRequestHit 
{
	public static void main(String[] args) throws IOException 
	{
		/********steps**********/
		/***********0th **properties load and json file load******************/
		/***********1st**while hitting the request we have to give the id value**************/
		/**********2nd**we have to hit the post request********************/
		/*********3rd**we have to validate the status code**************/
		/*********4th**we have to validate the jsondata****************/
		Properties pro=PropertiesFileLoad.propertiesLoad("../Api_framework_postRequest_7thJune/src/test/java/org/testing/resources/URI.properties");
		String jsonbodydata=JsonBodyDataLoad.JsonBodyData("../Api_framework_postRequest_7thJune/src/test/java/org/testing/resources/bodydata.json");
		System.out.println("body data is "+jsonbodydata);
		
		Random r=new Random();				//with the help of random class we can generate random number,random string
		Integer RandomVariable=r.nextInt();		//stored the RandomVariable variable into the interger class
		
		/***step1****/
		String BodydataAfterGivingVAalue=JsonVariableReplacement.JsonVariable(jsonbodydata, "id", RandomVariable.toString());		//here inserted key value of id.. will be generated randomly..we don't want user to again hardcode and stored the variable after giving value
		System.out.println(" bodydata after giving value "+BodydataAfterGivingVAalue.toString()); 
		
		
		
		/***step2*******/
		Http_method http=new Http_method(pro);
		Response res=http.PostReques(BodydataAfterGivingVAalue, "URI_friendRequest");
		System.out.println("status code is "+res.getStatusCode());
		
		/***step3****/
		ResponseStatusCodeValidate.ResponseStatusCode(201, res);
		System.out.println("data is "+res.asString());
		
		/*****step4***/
		ResponseDataValidationUsinngJsonPath.ResponseDataValidation("sheeran", res, "lastname");	
	}
}
