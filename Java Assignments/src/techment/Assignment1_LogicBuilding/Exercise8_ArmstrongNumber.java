package techment.Assignment1;

import java.util.*;

public class Exercise8_ArmstrongNumber {

	public static void main(String[] args) {

		/* Program to find whether a given 3 digit number is an Armstrong number or not. */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three digit number : ");
		int num=scanner.nextInt();
		
		int Number, remainder, result = 0;

        Number = num;

        while (Number!= 0)
        {
            remainder = Number % 10;
            result += Math.pow(remainder, 3);
            Number /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        
	}

}
