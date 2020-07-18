package Apitesting1.ApiT1;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Pojo_simple_data_post2
{
	public static void main(String[] args)
	{
		
		//***********body data creation***********
		
		Pojo_simple_data_post1 pojo=new Pojo_simple_data_post1();
		pojo.setFirstname("mike");
		pojo.setLastname("jordan");
		pojo.setCity("dc");
		pojo.setId("21");
		

		
		
		//************now hit the post request***********
		
		Response res=
		
		given()
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post("http://localhost:3000/friendRequest");
		
		System.out.println("the response data is " +res.statusCode());
		System.out.println("post data is :");
		System.out.println(res.asString());
		
	}
}
