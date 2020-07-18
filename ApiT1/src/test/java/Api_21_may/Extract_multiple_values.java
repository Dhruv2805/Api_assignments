//extracting from the json arraydata where in it json object resides in the form of index and we fetch it according to it
package Api_21_may;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Extract_multiple_values 
{
	public static void main(String[] args)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/friendRequest");
		
		JSONArray jsa=new JSONArray(res.asString());
		int l=jsa.length();
		
		for(int i=0;i<l;i++)
		{
			String id=jsa.getJSONObject(i).getString("id");
			System.out.println("the id value is "+id);
		}
	}
}
