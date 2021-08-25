package techment.Day3;

import java.util.Scanner;

public class Demo5_WhileUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int choice = 1;
		while(choice>0)
		{
			System.out.println("Enter your age : ");
			int age = scanner.nextInt();
			
			System.out.println("Your age is : "+age);
			System.out.println("Press 1 to continue else 0");
			choice = scanner.nextInt();
		}

	}

}
