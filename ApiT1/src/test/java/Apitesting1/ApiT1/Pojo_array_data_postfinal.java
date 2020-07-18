package Apitesting1.ApiT1;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Pojo_array_data_postfinal 
{
	public static void main(String[] args) 
	{
		/**************complex data creation******inner class***************/

	Pojo_array_data_post2[] poja=new Pojo_array_data_post2[2];
	poja[0]=new Pojo_array_data_post2();	//put one object in address0
	poja[0].setHouse_no("121B");
	poja[0].setSector("17");
	poja[0].setLandmark("Baker Street");
	
	poja[1]=new Pojo_array_data_post2();
	poja[1].setHouse_no("22C");
	poja[1].setSector("666");
	poja[1].setLandmark("casper Street");
	
	/**************complex data creation******outer class***************/
	
	Pojo_array_data_post1 pojoc11= new Pojo_array_data_post1();			//put one object in address1
	pojoc11.setFirstname("DEV");					
	pojoc11.setLastname("sharma");
	pojoc11.setDesignation("Software engineer");
	pojoc11.setId("11");
	pojoc11.setPojar(poja);
	
	
	
	/************now hit the post request*************/
	
	Response res=
	
	given()
	.contentType(ContentType.JSON)
	.body(pojoc11)
	.when()
	.post("http://localhost:3000/sendmessage");
	
	
	System.out.println(+res.getStatusCode());
	System.out.println("post data is :");
	System.out.println(res.asString());
	
	}
}
