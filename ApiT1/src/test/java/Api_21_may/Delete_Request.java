package Api_21_may;

import static com.jayway.restassured.RestAssured.*;

import java.io.FileNotFoundException;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Delete_Request 
{
	public static void main(String[] args) throws FileNotFoundException
	{	
		/*************delete request access***********/
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/friendRequest");
		
		System.out.println(+res.getStatusCode());
}
}