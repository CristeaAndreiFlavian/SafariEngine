package org.safari;

public class Safari
{
	
	private static final Safari CORE = new Safari();
	
	private Safari()
	{}

	public static final String BUILD_TYPE = "ALPHA";
	
	public static final int VERSION_MAJOR = 0,
							VERSION_MINOR = 1,
							VERSION_PATCH = 1,
							BUILD_NUMBER = 2;
	
	public static String getBuildType(String split)
	{
		if (split == " ")
		{
			return BUILD_TYPE 
				   +
				   " ";
		}
		else if (split == "")
		{
			return BUILD_TYPE;
		}
		return null;
	}
	
	public static String getBuildNumber(String split)
	{
		if (split == " ")
		{
			return String.valueOf(BUILD_NUMBER)
				   +
				   " ";
		}
		else if (split == "")
		{
			return String.valueOf(BUILD_NUMBER);
		}
		return String.valueOf(BUILD_NUMBER);
	}
	
	public static String getVersion() 
	{
		return String.valueOf(VERSION_MAJOR) 
			   +
			   "." 
			   +
			   String.valueOf(VERSION_MINOR)
			   +
			   "."
			   +
			   String.valueOf(VERSION_PATCH);
	}
	
}