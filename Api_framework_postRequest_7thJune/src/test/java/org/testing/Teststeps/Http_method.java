package org.testing.Teststeps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Http_method
{
	Properties pr;
	public  Http_method(Properties p)
	{
		this.pr=p;
	}
	public Response PostReques(String bodydata,String Keyname)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(Keyname));
		
		return res;
	}
}
