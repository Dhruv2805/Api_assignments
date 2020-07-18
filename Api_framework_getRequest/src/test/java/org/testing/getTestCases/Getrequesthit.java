package org.testing.getTestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.getTeststeps.getHttpMethod;
import org.testing.getutilities.Getproperties_Load;


import com.jayway.restassured.response.Response;

public class Getrequesthit 
{
	public static void main(String[] args) throws IOException 
	{
		Properties p=Getproperties_Load.getpropload("../Api_framework_getRequest/src/test/java/org/testing/getresources/getProperties.properties");
	
		getHttpMethod get_http=new getHttpMethod(p);
	
		
		Response get_res=get_http.getrequesthit("getURI_sendmessage");
		
		
		System.out.println("the get response code is "+get_res.getStatusCode());
	
		System.out.println("the get response data is "+get_res.asString());

		
	}
}
