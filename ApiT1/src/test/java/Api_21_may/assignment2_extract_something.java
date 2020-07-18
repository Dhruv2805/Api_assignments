package Api_21_may;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class assignment2_extract_something
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
			String firstname=jsa.getJSONObject(i).getString("firstname");
			System.out.println("the firstname value is "+firstname);
		}
	}
}
