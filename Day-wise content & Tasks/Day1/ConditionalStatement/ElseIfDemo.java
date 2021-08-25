package techment.Day1.ConditionalStatement;

import java.util.Scanner;

public class ElseIfDemo {
	
	// Program to take input from user according to user's choice

	public static void main(String[] args) {
		
		System.out.println("Press...\n 1. Withdraw \n 2. Deposit \n 3. Mini statement \n");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice == 1)
			System.out.println("You are doing withdraw");
		else if(choice == 2)
		    System.out.println("You are doing deposit");
		else if(choice ==3)
			System.out.println("Mini statement");
		else
			System.out.println("Please enter correct choice");

	}

}
