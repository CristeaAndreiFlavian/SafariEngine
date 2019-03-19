package org.safari.util.exception;

public class SafariEngineException extends Exception
{
	private static final long serialVersionUID = -1958000046888391691L;

	public SafariEngineException() 
    {}
	 
    public SafariEngineException(final String message) 
    {
        super(message);
    }
	
	public SafariEngineException(final Throwable cause) 
	{
        super(cause);
    }
    
    public SafariEngineException(final String message, final Throwable cause) 
    {
        super(message, cause);
    }
	
}