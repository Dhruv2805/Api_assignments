package Api_21_may;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Assignment3_extract_postal_code 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		/*************data ready for read*****************/
		
		File f=new File("../ApiT1/src/test/java/Api_21_may/assignment3_21may_body_data");
		FileReader fr=new FileReader(f);
		JSONTokener jst=new JSONTokener(fr);
		
		JSONObject jsa1=new JSONObject(jst);
		System.out.println("the read jsonobject data is " +jsa1.toString());
		
		/************data ready for fetching the postal code value ****************/
			
		String postalCode=jsa1.getJSONObject("address").getString("postalCode");
		
		System.out.print("postal code value is ");
		System.out.println(postalCode);
	
		
	}
}
