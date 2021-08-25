package techment.Day2.Array;

import java.util.*;

public class ArrayUserInput {

	public static void main(String[] args) {

		int marks[] = new int[3];
		
		//Taking marks from user
		Scanner scanner = new Scanner(System.in);
	
		for(int i=0; i<marks.length; i++)
		{
			System.out.print("enter the "+ i +" marks : ");
			marks[i] = scanner.nextInt();
		}
		
		//Printing marks
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}

	}

}
