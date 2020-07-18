package Apitesting1.ApiT1;

import static com.jayway.restassured.RestAssured.*;

import java.net.URI;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest 
{
	public static void main(String[] args)
	{
		
		Response res=					//all methods are imported//
				
		given()						
		.contentType(ContentType.JSON)  //given is a static method which has given object ,with the help of object we called contenttype method using dot keyword//
		.when()							//contentType is a static method which has given object ,with the help of object we called WHEN method using dot keyword//
		.get(" http://localhost:3000/comments");  //WHEN is a static method which has given object ,with the help of object we called GET method using dot keyword//
												  //with the help of get method ,it has return the response object(from library) which we have stored in res(reference variable of response class)//
		
		System.out.println("status code is " +res.statusCode()); //statuscode(from library) method will give actual status code
		System.out.println("****data is*** ");
		System.out.println(res.asString());		//asString() method is used so that our data can be shown in actual words//
		
		
	}
}
