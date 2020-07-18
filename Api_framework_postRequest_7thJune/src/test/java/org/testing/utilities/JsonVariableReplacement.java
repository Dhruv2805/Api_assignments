package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement 	//class for making variable--id-- value generic..not hardcoded
{
	public static String JsonVariable(String jsonbody,String variablename,String insertedvalue)		//here ..we need 3 parameters
																									//first we have given jsonbody from in there  we will give variable name and then we will give a inserted key value to that variablename 
	{	
		String Returndata=jsonbody.replaceAll(Pattern.quote("{{"+variablename+"}}"), insertedvalue);		//same as given parameters
		return Returndata;
	}
}
