package org.testing.getTeststeps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.google.gson.JsonObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class getHttpMethod 
{
	Properties pr;

	public getHttpMethod(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response getrequesthit(String keyname)
	{
		
		
			Response res=
						
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(pr.getProperty(keyname));
			
			
			
			return res;
		
	}
}
