//assignment to create array json using org.json for post request

package Apitesting1.ApiT1;


import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Org_json_array_data 
{
	public static void main(String[] args) 
	{
		//***********body data creation***********
		

		JSONObject address=new JSONObject();
		address.put("city", "new delhi");
		address.put("district", "NE delhi");
		
		JSONObject obj1=new JSONObject();
		obj1.put("fname", "dhruv");
		obj1.put("lname", "sharma");
	
		
		
		
		JSONArray arr=new JSONArray();
		arr.put(0,obj1);
		arr.put(1,address);
		
		
		
		
		JSONObject obj2=new JSONObject();
		obj2.put("intrest1", "music");
		obj2.put("intrest2", "reading");
		obj2.put("id", "drv1");
		obj2.put("array_obj",arr );
		
		
		
		System.out.println("data created is");
		System.out.println(obj1.toString());
		
		//************now hit the post request***********
		
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .body(obj2.toString())
		 .when()
		 .post("http://localhost:3000/friendRequest");
		 
		 System.out.println("the status code is " +res.statusCode());
		 System.out.println(obj1.toString());
	}
}
