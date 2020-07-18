package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;




public class JsonBodyDataLoad 
{
	public static String JsonBodyData(String pathname) throws FileNotFoundException
	{
		File f=new File(pathname);
		FileReader fr=new FileReader(f);
		JSONTokener jst=new JSONTokener(fr);
		
		JSONObject jsobj=new JSONObject(jst);
		return jsobj.toString();
		
	}
}
