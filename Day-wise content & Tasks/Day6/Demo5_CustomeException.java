package techment.Day6;

class AgeException extends RuntimeException
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
}

//extends Exception for all compile time exception
class IdNotFoundException extends Exception 
{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
}

public class Demo5_CustomeException {

	public static void main(String[] args) throws IdNotFoundException {
		
		//throw new AgeException("Not a valid age");
		
		throw new IdNotFoundException("Id not found");

		
	}

}
