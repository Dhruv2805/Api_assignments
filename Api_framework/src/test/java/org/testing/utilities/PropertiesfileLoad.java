package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class PropertiesfileLoad 
{
	/*************creating a method that will load the properties file and that method will return the object of properties class ***************/
	/**********this method returning the object of properties class************/
	public static Properties  properties_Load(String path) throws IOException
	{
	//	File f=new File("/Api_framework/src/test/java/org/testing/testcases/URIs.properties"); //here this is the limitation that our path is restrict to only d drive only
		File f=new File(path);									//conenction established								//1st..here it is generic method
		
		
		FileReader fr=new FileReader(f);		//4th..created filereader object
		Properties pr=new Properties();			//2nd..we have created the object of a properties class given by java
		pr.load(fr);						//3rd..here with the help of pr object we are using load class and it require filereader object for it...Reads a property list (key and element pairs) from the inputbyte stream. 
		
		return pr;							//after loading succesfully and we want our method will return object of properties class ,..for that return type =properties
		
		
	}
}
