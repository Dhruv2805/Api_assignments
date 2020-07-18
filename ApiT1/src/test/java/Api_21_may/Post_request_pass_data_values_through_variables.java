package Api_21_may;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Post_request_pass_data_values_through_variables
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		/************************Firstly we will read the data   ****************/
		File f= new File("../ApiT1/src/test/java/Api_21_may/Bodydatavalues_through_variables");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		
		JSONObject jobj=new JSONObject(jt);
		
		System.out.println("body data is "+jobj.toString());
		
		
		String bodyData=jobj.toString();			/* now we will store the json object in string data along with variables  for replacing all varialble further */
		//(Pattern.quote("{{"+"f_name"+"}}")--> this is our search value , and our replacement on search value is -->  "maximus"
		//now we are passing the variables and their values also
		bodyData=bodyData.replaceAll(Pattern.quote("{{"+"f_name"+"}}"), "max");				//Pattern--> The resulting pattern(with the help of pattern class) can then be used to create a Matcher object that can match arbitrary character sequences against the regularexpression (like {{f_name}}). 
																						//.quote-->Returns a literal pattern String for the specified String. 
		bodyData=bodyData.replaceAll(Pattern.quote("{{"+"l_name"+"}}"), "samuel");
		bodyData=bodyData.replaceAll(Pattern.quote("{{"+"id"+"}}"), "008");				//this way of passing values has limitations that if we have to pass 10 to 20 variables the we have to pass 10-20 lines in code.
		//we have done --> bodyData= because we have done the changes so now we have to again store this in bodyData//->if we skip thi then our data will be like line num 26 ..maximus value won't be visible//
		System.out.println("body data for post request is ");
		System.out.println(bodyData); 
		
		/********NOW hit the post request**************/

		Response res=	
		
			given()
			.contentType(ContentType.JSON)
			.body(bodyData)
			.when()
			.post("http://localhost:3000/friends");
		System.out.println(+res.getStatusCode());
		System.out.println("post data after request hit is ");
		System.out.println(bodyData.toString());
	}
}
