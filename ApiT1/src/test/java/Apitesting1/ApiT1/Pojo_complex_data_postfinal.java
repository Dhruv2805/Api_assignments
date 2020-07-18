package Apitesting1.ApiT1;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Pojo_complex_data_postfinal 
{
	public static void main(String[] args)
	{
		
		/**************complex data creation******inner class***************/
		
		Pojo_complex_data_post2 pojoc= new Pojo_complex_data_post2();
		pojoc.setHouse_no("117");
		pojoc.setSector("17");
		pojoc.setLandmark("avenue park");
		
		
	/**************complex data creation******outer class***************/
		
		Pojo_complex_data_post1 pojoc1= new Pojo_complex_data_post1();
		pojoc1.setFirstname("DEV");
		pojoc1.setLastname("sharma");
		pojoc1.setDesignation("Software engineer");
		pojoc1.setId("11");
		pojoc1.setPojoc2(pojoc);
	
		
	
		
		/************now hit the post request*************/
		
		Response res=
		
		given()
		.contentType(ContentType.JSON)
		.body(pojoc1)
		.when()
		.post("http://localhost:3000/sendmessage");
		
		
		System.out.println(+res.getStatusCode());
		System.out.println("post data is :");
		System.out.println(res.asString());
		
	}
}
