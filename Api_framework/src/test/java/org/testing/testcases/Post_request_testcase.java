package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.Httpmethods;
import org.testing.utilities.Jsonloadfile;
import org.testing.utilities.PropertiesfileLoad;
import com.jayway.restassured.response.Response;

public class Post_request_testcase 
{
	public static void main(String[] args) throws IOException
	{
		
		Properties p=PropertiesfileLoad.properties_Load("../Api_framework/src/test/java/org/testing/resources/URIs.properties");
		String bodydata=Jsonloadfile.jsonobjectdataload("../Api_framework/src/test/java/org/testing/resources/frame_bodydata.json");
		Httpmethods http=new Httpmethods(p);
		Response res=http.postrequesthit(bodydata, "URI_sendmessage");
		
		System.out.println("the response code is " +res.getStatusCode());
		
	}
}
