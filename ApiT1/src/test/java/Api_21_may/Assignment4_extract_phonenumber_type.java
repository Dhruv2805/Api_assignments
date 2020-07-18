package Api_21_may;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.*;

public class Assignment4_extract_phonenumber_type
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		/*************data ready for read*****************/
		File f=new File("../ApiT1/src/test/java/Api_21_may/assignment3_21may_body_data");
		FileReader fr=new FileReader(f);
		JSONTokener jst=new JSONTokener(fr);
		
		JSONObject jsa1=new JSONObject(jst);
		System.out.println("the read json object data is " +jsa1.toString());
		
	
		JSONArray arr=jsa1.getJSONArray("phoneNumbers");		//now getting the array data with fetching  key value "phoneNumbers"
		int l=arr.length();
		for(int i=0;i<l;i++)
		{
		String type=arr.getJSONObject(i).getString("type");		//from array data we are extracting the "type" value
		
		System.out.println("phone number type value is "  +type);	
		
		
		}
		
		
	}
}
