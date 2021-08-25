package techment.Day3;

import java.util.Scanner;

public class Demo8_ArrayUserInput {

	public static void main(String[] args) {
		
		int marks[] = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		//for taking user input
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter the "+i+" marks : ");
			marks[i]=scanner.nextInt();
		}
		
		//for printing the array values
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}

	}

}
