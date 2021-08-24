package techment.Assignment5_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author POONAM
 *1 – Using try-catch
Create a class ExceptionTest with a main method. The main method should accept two numbers as commandline arguments. 

In the main method, Divide the two numbers and display the result.

The main method should display the following messages in case of invalid data passed through command line arguments.

•	If no arguments are passed, the program should display “ No Input received”
•	If the numbers provided are not integers, the program should display “Only integers are allowed”
•	If the division results in ArithmeticException, display “Division with zero is not possible”


 */

public class Exercise1_UsingTryCatch {

	public static void main(String[] args) {

		int numerator;
		int denominator;
		float result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numerator:");
		numerator = scanner.nextInt();
		System.out.println("Enter denominator:");
		denominator = scanner.nextInt();
		try 
		{ 
			result = (numerator/denominator);
			System.out.println(result);
		}  

		catch (ArithmeticException e)
		{
			System.out.println("Division with zero is not possible");
		}

		catch (InputMismatchException e)  
		{ 
			System.out.println("Only Integers are allowed"); 
		} 
		catch (NullPointerException e)
		{
			System.out.println("No Input received");
		}

	}

}
