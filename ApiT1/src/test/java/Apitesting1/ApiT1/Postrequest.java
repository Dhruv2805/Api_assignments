//assignment to create simple json using org.json for post request

package Apitesting1.ApiT1;


import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Postrequest 
{
	public static void main(String[] args) 
	{
		
		//************body data ready for org.JSON************/
		JSONObject obj=new JSONObject();
		obj.put("firstname", "dhruv");
		obj.put("lastname", "sharma");
		obj.put("id", "drv");
		obj.put("age", "25");
		
		System.out.println("the ready body data is ");
		System.out.println(obj.toString());
		//************we will be hitting post request************/
		
		Response res=
		
		given()
		.contentType(ContentType.JSON)
		.body(obj.toString())
		.when()
		.post( "http://localhost:3000/sendmessage");
		
		System.out.println("status Code"+res.statusCode());
	}
}
