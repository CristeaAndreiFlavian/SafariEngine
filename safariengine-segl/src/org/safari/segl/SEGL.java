package org.safari.segl;

public class SEGL 
{
	
	private static final String SEGL_CAPABILITIES = "CAPSC";
	private static final String SEDL_VIDEO_MODE = "GSVMV";
	private static final String SEGL_VERSION = "1.0.1";
	private static boolean capabilitiesInit = false;
	
	public static final int SEDL_VIDEO_MODE_VALUE = 0x4;
	public static final int CAPABILITIES_INIT = 0x3;
	public static final int CAPABILITIES = 0x1;
	public static final int VERSION = 0x2;
	
	SEGL()
	{}
	
	public static void createSEGLCapabilities(String value)
	{
		if (value == "CAPSC")
			capabilitiesInit = true;
		else
			System.err.println("Couln't create SEGL Capabilities!");
	}
	
	public static boolean seglGetBooleanValue(int value)
	{
		if (value == 0x3)
			return capabilitiesInit;
		return true;
	}
	
	public static String seglGetStringValue(int value)
	{
		if (value == 0x1)
			return SEGL_CAPABILITIES;
		else if (value == 0x2)
			return SEGL_VERSION;
		else if (value == 0x4)
			return SEDL_VIDEO_MODE;
		return null;
	}
	
}