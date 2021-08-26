package techment.Day6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author POONAM
 * 
 * Task-1 Take two numbers from user
 * 
 *  if user enters zero -> don't give zero
 *  if user enters character -> don't give character
 * 
 */

public class Task1_Exception {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try
		{
			System.out.print("Enter first number : ");
			int num1 = scanner.nextInt();
			System.out.println("num1 = "+num1);

			System.out.print("Enter second number : ");
			int num2 = scanner.nextInt();
			System.out.println("num2 = "+num2);

			int num3 = num1 / num2;
			System.out.println("Division : " +num3);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception : Don't give zero");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Type only number!");
		}
	}
}

