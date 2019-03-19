package org.safari.util;

public class OSReader 
{

	public static String getOS()
	{
		String property = "os.name";
		String result = System.getProperty(property);
		return result;
	}
	
}