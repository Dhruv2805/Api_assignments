package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Jsonloadfile 
{
	public static String jsonobjectdataload(String path) throws FileNotFoundException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		JSONTokener jst=new JSONTokener(fr);
		
		JSONObject json_data=new JSONObject(jst); 
		return json_data.toString();
		
	}
}
