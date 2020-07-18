package Api_21_may;

import org.json.JSONArray;
import org.json.JSONObject;
import org.mozilla.javascript.tools.shell.Main;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Extract_single_value 
{
	public static void main(String[] args) 
	{
		Response res=
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/friendRequest");			//first.. we have get the jsonobject 
		
		JSONArray jsa=new JSONArray(res.asString());			//second ..converted json array to string value
		String id=jsa.getJSONObject(3).getString("id");			//third..we have get the json object index 3rd data and from that we have extract the id key value data and store it in new id string variable
		System.out.println("id value is"+ id);
	}
}
