package techment.Assignment1;

import java.util.Scanner;

public class Exercise2_TrafficCongestion {

	public static void main(String[] args) {

		/*Program to accept the day value between 1-31 as input and display appropriate message as
		output based on the day.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the current day value : ");
		
		for(int i=1; i<32; i++)
		{
			int dayValue = scanner.nextInt();
			
			if(dayValue%2 == 0 && dayValue<32)
				System.out.println("Cars with Even registration numbers are permitted today");
			
			else if(dayValue!=0 && dayValue<32 )
				System.out.println("Cars with Odd registration numbers are permitted today");
			else
				System.out.println("Invalid input");
		}
				
	}
}
