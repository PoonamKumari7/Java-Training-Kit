package techment.Day2.LoopingStatement;

import java.util.*;

public class WhileLoopUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int choice = 1;
		while(choice>0)
		{
			System.out.print("Enter your age : ");
			int age = scanner.nextInt();
			
			System.out.println("Your age is : "+ age);
			System.out.println("Press 1 to continue else 0");
			choice = scanner.nextInt();
			
		}

	}

}
