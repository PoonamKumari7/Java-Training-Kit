package techment.Day6;

public class Demo1_Exception {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println(1+1);
		try
		{
			System.out.println(1/0); //Exception occurs //Exception type-ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not divide by zero");
		}
		
		System.out.println("Welcome");

	}

}
