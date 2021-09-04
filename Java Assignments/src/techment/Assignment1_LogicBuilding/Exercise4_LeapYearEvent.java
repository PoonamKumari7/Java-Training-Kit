package techment.Assignment1;

import java.util.*;

public class Exercise4_LeapYearEvent {

	public static void main(String[] args) {
		
		/* Program to accept a year value as input and display if the year is a leap year or not */
		
		int year;
		System.out.print("Enter an Year : ");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();

	    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("\nThis is a leap year.");
	    else
	         System.out.println("\nThis is not a leap year.");

	}

}
