package techment.Day6.Demo6_CustomeException;

public class InsufficientFundException extends RuntimeException {
	
	public InsufficientFundException (String message)
	{
		super(message);
	}

}
