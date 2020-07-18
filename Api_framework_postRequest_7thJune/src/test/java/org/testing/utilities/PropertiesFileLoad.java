package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad
{
	public static Properties propertiesLoad(String pathname) throws IOException
	{
		File f=new File(pathname);
		FileReader fr=new FileReader(f);
		Properties prop=new Properties();
		prop.load(fr);
		return prop;
	}
}
