
//assignment to create complex json using org.json for post request

package Apitesting1.ApiT1;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Postrequest_complex
{
	public static void main(String[] args)
	{
		
			
			//************body data ready for org.JSON************/
		
		JSONObject address=new JSONObject();
		address.put("city", "delhi");
		address.put("street", "17");
		
		
		
			JSONObject obj=new JSONObject();
			obj.put("firstname", "dhruv");
			obj.put("lastname", "sharma");
			obj.put("id", "drv");
			obj.put("age", "25");
			obj.put("address", address);
			
			System.out.println("the ready body data is ");
			System.out.println(obj.toString());
			//************we will be hitting post request************/
			
			Response res=
			
			given()
			.contentType(ContentType.JSON)
			.body(obj.toString())
			.when()
			.post("http://localhost:3000/friends");
			
			System.out.println("status Code"+res.statusCode());
			System.out.println(obj.toString());
		
	}
}
