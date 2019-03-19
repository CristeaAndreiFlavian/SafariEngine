package org.safari.segl;

import org.safari.sedl.SEDL;

public class SEGL10 
{

	SEGL10()
	{}
	
	private static boolean NANO_BUFFER_DATA_BIND = false;
	
	//Nano Buffer Array
	public static final int NANO_BUFFER_DATA = 0;
	public static final int NANO_BUFFER = 1;
	
	public static void seglCreateBufferData(int bufferData)
	{
		int buffers = 2;
		if (bufferData == 0)
		{
			SEDL.getCanvas().createBufferStrategy(buffers);
		}
	}
	
	public static void seglBindBufferData(int bufferData)
	{
		if (bufferData == 0)
		{
//			SEDL.setSEGLGraphics(new SEGL10(), SEDL.getSEGLStrategy(new SEGL10()).getDrawGraphics());
			NANO_BUFFER_DATA_BIND = true;
		}
	}
	
	public static void seglCreateBuffer(int buffer)
	{
		if (buffer == 1)
		{
//			SEDL.getSEGLCanvas(new SEGL10()).createBufferStrategy(2);
			SEDL.setSEGLStrategy(SEDL.getCanvas().getBufferStrategy());
		}
	}
	
	public static void seglBindBuffer(int buffer)
	{
		if (buffer == 1)
		{
			if (NANO_BUFFER_DATA_BIND)
			{
				SEDL.setSEGLGraphics(SEDL.getStrategy().getDrawGraphics());
			}
			else
			{
				System.err.println("NBA Buffer Data isn't binded!");
				System.exit(0);
			}
		}
	}
	
	public static void seglDrawBuffers()
	{
		SEDL.getGraphics().drawImage(SEDL.getBufferedImage(), 0, 0, SEDL.getCanvas().getWidth(), SEDL.getCanvas().getHeight(), null);
	}

	public static void seglShowBuffers() 
	{
		SEDL.getStrategy().show();
	}
	
}