package techment.Assignment1;

import java.util.Scanner;

/** Program to convert Binary data to Decimal. */

public class Exercise48_ConvertBinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long binaryNumber, decimalNumber = 0, j = 1, remainder;

		System.out.print("Enter a Binary number : ");
		binaryNumber = sc.nextLong();

		while (binaryNumber != 0) 
		{
			remainder = binaryNumber % 10;
			decimalNumber = decimalNumber + remainder * j;
			j = j * 2;
			binaryNumber = binaryNumber / 10;
		}
		System.out.println("Equivalent Decimal Number is : " + decimalNumber);
	}
}