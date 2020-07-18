package org.testing.teststeps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Httpmethods 			//who will create the http method that has to pass the properites file object 
{
	Properties pr;
	public  Httpmethods(Properties pr)
	{
		this.pr=pr;
		
	}
	
	public  Response postrequesthit(String bodydata, String keyname)				//we need 2 things for post request ..body data and key name ..which  we will make generic.(not hardcoded) 
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(keyname));												//now here we have to make a new method ..with that we will invoke property file object
		
		return res;
	}

}
