package org.safari.sedl;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//import org.safari.segl.SEGL;
//import org.safari.segl.SEGL10;
//import org.safari.sevg.SEVG;

public class SEDL 
{
	
	private static boolean sedlInitialized = false;
	
	private static int sedlWidth = 0,
					   sedlHeight = 0;
	
	private static ImageIcon iconImage = new ImageIcon("./res/icon.png");
	
	private static JFrame window;
	private static Canvas canvas;
	private static Graphics graphics;
	private static BufferedImage image;
	private static BufferStrategy strategy;
	
	private SEDL()
	{}
	
	private static void initSEDL()
	{
		if (!sedlInitialized)
			sedlInitialized = true;
//		if (handler != 481014871)
//		{
//			System.err.println("The Window Handler wasn't initialized correctly!");
//			System.exit(0);
//		}
//		else
//		{
//			iconImage = new ImageIcon("res/icon.png");
//			image = new BufferedImage(sedlWidth, sedlHeight, BufferedImage.TYPE_INT_RGB);
//			window = new JFrame();
//			canvas = new Canvas();
//			canvas.setPreferredSize(new Dimension(sedlWidth, sedlHeight));
//			canvas.setMaximumSize(new Dimension(sedlWidth, sedlHeight));
//			canvas.setMinimumSize(new Dimension(sedlWidth, sedlHeight));
//			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//			window.setLayout(new BorderLayout());
//			window.add(canvas, BorderLayout.CENTER);
//			window.pack();
//			window.setIconImage(image);
//			window.setVisible(true);
//			window.setLocationRelativeTo(null);
//			canvas.createBufferStrategy(2);
//			strategy = canvas.getBufferStrategy();
//			graphics = strategy.getDrawGraphics();
//		}
//		iconImage = new ImageIcon("res/icon.png");
		image = new BufferedImage(sedlWidth, sedlHeight, BufferedImage.TYPE_INT_RGB);
		window = new JFrame();
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(sedlWidth, sedlHeight));
		canvas.setMaximumSize(new Dimension(sedlWidth, sedlHeight));
		canvas.setMinimumSize(new Dimension(sedlWidth, sedlHeight));
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.setLayout(new BorderLayout());
		window.add(canvas, BorderLayout.CENTER);
		window.pack();
		window.setIconImage(image);
		window.setVisible(true);
//		window.setLocationRelativeTo(null);
//		canvas.createBufferStrategy(2);
//		strategy = canvas.getBufferStrategy();
//		graphics = strategy.getDrawGraphics();
	}
	
	@Deprecated
	public static void sedlCreateBuffers(/*int buffers*/)
	{
		System.out.println("!! WARNING !! Deprecated Method.");
		terminateSEDL();
//		if (SEGL.seglGetBooleanValue(SEGL.CAPABILITIES_INIT))
//			if (buffers != 2)
//				System.err.println("SafariEngine doesn't supports " + buffers + "D Graphics!");
//			else
//				canvas.createBufferStrategy(buffers);
//		else
//		{
//			System.err.println("SEGL Capabilities couln't be detected!");
//			System.exit(0);
//		}
	}
	
	@Deprecated
	public static void sedlPollBuffers()
	{
		System.out.println("!! WARNING !! Deprecated Method.");
		terminateSEDL();
//		if (SEGL.seglGetBooleanValue(SEGL.CAPABILITIES_INIT))
//			strategy = canvas.getBufferStrategy();
//		else
//		{
//			System.err.println("SEGL Capabilities couln't be detected!");
//			System.exit(0);
//		}
	}
	
	@Deprecated
	public static void sedlFlipBuffers(/*int handle*/)
	{
		System.out.println("!! WARNING !! Deprecated Method.");
		terminateSEDL();
//		if (handle != 481014871)
//		{
//			System.err.println("The Window Handler wasn't initialized correctly!");
//			System.exit(0);
//		}
//		else
//		{
//			if (SEGL.seglGetBooleanValue(SEGL.CAPABILITIES_INIT))
//				graphics = strategy.getDrawGraphics();
//			else
//			{
//				System.err.println("SEGL Capabilities couln't be detected!");
//				System.exit(0);
//			}
//		}
	}
	
	public static void sedlSetWindowPosition(int handle, int x, int y)
	{
		if (handle != 481014871)
		{
			System.err.println("The Window Handler wasn't initialized correctly!");
			System.exit(0);
		}
		else
		{
			if (x == SEDLVideoMode.getVideoMode().getX())
				if (y == SEDLVideoMode.getVideoMode().getY())
					window.setLocationRelativeTo(null);
				else
					window.setLocation(x, y);
			else
				window.setLocation(x, y);
		}
	}
	
	public static void sedlSetWindowIconAttribute(ImageIcon iconAttribute, int handle)
	{
		if (handle != 481014871)
		{
			System.err.println("The Window Handler wasn't initialized correctly!");
			System.exit(0);
		}
		else
		{
			window.setIconImage(iconAttribute.getImage());
		}
	}
	
	public static void sedlSetWindowTitle(String title, int handle)
	{
		if (handle != 481014871)
		{
			System.err.println("The Window Handler wasn't initialized correctly!");
			System.exit(0);
		}
		else
		{
			window.setTitle(title);
		}
	}
	
	@Deprecated
	public static void sedlDrawBuffers()
	{
		System.out.println("!! WARNING !! Deprecated Method.");
		terminateSEDL();
//		graphics.drawImage(image, 0, 0, canvas.getWidth(), canvas.getHeight(), null);
	}

	@Deprecated
	public static void sedlCreateWindow(/*String title, int width, int height*/)
	{
		System.out.println("!! WARNING !! Deprecated Method.");
		terminateSEDL();
//		sedlWidth = width;
//		sedlHeight = height;
//		initSEDL();
//		window.setTitle(title);
//		if (!sedlInitialized)
//			sedlInitialized = true;
	}
	
	public static void sedlCreateWindow(int width, int height)
	{
		sedlWidth = width;
		sedlHeight = height;
		initSEDL();
//		if (!sedlInitialized)
//			sedlInitialized = true;
	}
	
	@Deprecated
	public static void sedlSetViewport(/*int handle, int x, int y, int width, int height*/)
	{
		System.out.println("!! WARNING !! Deprecated Method.");
		terminateSEDL();
//		if (handle != 481014871)
//		{
//			System.err.println("The Window Handler wasn't initialized correctly!");
//			System.exit(0);
//		}
//		else
//		{
//			strategy.show();
//		}
	}
	
	public static void terminateSEDL()
	{
//		if (window.isVisible())
//		{
//			window.setVisible(false);
//			System.exit(0);
//		}
//		else
//		{
//			System.exit(0);
//		}
		window.setVisible(false);
		System.exit(0);
	}
	
	public static int getSEDLWidth()
	{
		return window.getWidth();
	}
	
	public static int getSEDLHeight()
	{
		return window.getHeight();
	}
	
	@Deprecated
	public static void /*boolean*/ isClosedRequested()
	{
		System.out.println("!! WARNING !! Deprecated Boolean.");
		terminateSEDL();
//		return !window.isVisible();
//		return true;
	}

//	@Deprecated
	public static /*void*/ boolean isCloseRequested()
	{
//		System.out.println("!! WARNING !! Deprecated Boolean.");
//		terminateSEDL();
		return !window.isVisible();
	}
	
	public static boolean isSEDLInitialized()
	{
		return sedlInitialized;
	}
	
	public static Canvas getCanvas()
	{
		return canvas;
	}
	
	public static BufferStrategy getStrategy()
	{
		return strategy;
	}
	
	public static Graphics getGraphics()
	{
		return graphics;
	}
	
	public static BufferedImage getBufferedImage()
	{
		return image;
	}
	
	public static SEDLVideoMode getVideoModeInstance()
	{
		return new SEDLVideoMode();
	}
	
	public static SEDLVideoMode getVideoModeInstance(String value)
	{
		return new SEDLVideoMode(value);
	}
	
	public static void setSEGLStrategy(BufferStrategy instance)
	{
		strategy = instance;
	}
	
	public static void setSEGLGraphics(Graphics instance)
	{
		graphics = instance;
	}

//	@Deprecated
	public static /*void*/ int initSEDLDisplayHandler(/*int replacer*/) {
//		System.out.println("!! WARNING !! Deprecated Method.");
//		terminateSEDL();
//		replacer = 481014871;
		return 481014871;
	}
}