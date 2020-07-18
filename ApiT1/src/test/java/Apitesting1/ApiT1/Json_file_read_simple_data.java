//this program erading the simple,complex,array data but have to change body data according to it 
package Apitesting1.ApiT1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;



public class Json_file_read_simple_data
{
	
	//first we have to read the data from json file .
	//then we have to pass the request to the post request
	public static void main(String[] args) throws FileNotFoundException
	{	//**********now data ready for read********//
		File f=new File("../ApiT1/src/test/java/Apitesting1/ApiT1/Bodydata.json");  		//1st we will built a connection
		FileReader fr=new FileReader(f);													//3rd we have called inputstrean or reader class and pass the object to jsontockener class
		JSONTokener js=new JSONTokener(fr);		//main use to read the json data 											//2nd we will call a jsontockener class to read the json object data of org.json file data but it need reader class object-->fr
		
		
		JSONArray jobj=new JSONArray(js);		//json data is in the form of json object (starting wiht object											//4th we will use the json object   from json org.json file
		
		System.out.println("data ready for post request");
		System.out.println(jobj.toString());
		
		
		
		/*************post request access***********/
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(jobj.toString())
		.when()
		.post("http://localhost:3000/friendRequest");
		
		System.out.println(+res.getStatusCode());
		
	}
}
