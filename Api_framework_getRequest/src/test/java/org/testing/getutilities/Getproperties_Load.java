package org.testing.getutilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Getproperties_Load 
{
	public static Properties getpropload(String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		
		return pr;
	}
}
