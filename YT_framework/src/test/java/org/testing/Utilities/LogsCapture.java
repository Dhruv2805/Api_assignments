package org.testing.Utilities;




import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture
{
	public static void Takelogs(String classname,String message)
	{
		DOMConfigurator.configure("../YT_framework/layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
		
	}
}
