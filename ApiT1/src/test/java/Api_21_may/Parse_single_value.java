package Api_21_may;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Parse_single_value 
{
	public static void main(String[] args)
	{
		
		Response res=					//all methods are imported//
				
		given()						
		.contentType(ContentType.JSON)  //given is a static method which has given object ,with the help of object we called contenttype method using dot keyword//
		.when()							//contentType is a static method which has given object ,with the help of object we called WHEN method using dot keyword//
		.get("http://localhost:3000/friends");  //WHEN is a static method which has given object ,with the help of object we called GET method using dot keyword//
												  //with the help of get method ,it has return the response object(from library) which we have stored in res(reference variable of response class)//
		
		
		JSONArray jsa=new JSONArray(res.asString());	//1st we will store the response in the json array .
	/*	String id=jsa.getJSONObject(1).getString("id");		//2nd we will get the zero index object from stored data and 3rd from get object(0index) we will search id value...4th after search we will store it in id string
		System.out.println("id value is "+id); */
		
	try 
	{	
		int l=jsa.length();
		for(int i=1;i<l;i++)
		{
			String ids=jsa.getJSONObject(i).getString("id");
			System.out.println("id value is "+ids);
		}	
	}
	catch(Exception e)
	{
		System.out.println("exception came");
	}
	
	}
}
//int id=	Integer.parseInt(jsa.getJSONObject(0).getString("id"));