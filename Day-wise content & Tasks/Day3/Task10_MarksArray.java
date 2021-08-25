package techment.Day3;

import java.util.Scanner;

public class Task10_MarksArray {

	public static void main(String[] args) {

		//Asking how many marks user wants to enter i.e Array size
		Scanner scanner= new Scanner(System.in);
		System.out.print("How many subject's marks you want to enter : ");
		int n = scanner.nextInt();
		System.out.println();

		//Declare an array of marks		
		int marks[] = new int[n];

		int lowest = n, highest = 0;
		for(int i=0, m=1; i<n; i++, m++)
		{
			System.out.print("Please Enter the Subject "+m +" mark : ");
			marks[i]= scanner.nextInt();

			if(marks[i] > highest)
			{
				highest = marks[i];
			}
			
			if(marks[i]< lowest )
			{
				lowest = marks[i];
			}
		}

		//Show all marks
		System.out.print("\nList of marks of "+n + " subjects are : ");
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.print(marks[i]+ " ");
		}
		
		//Sum of all Marks
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			sum = sum + marks[i];
		}
		System.out.println("\n\nSum of marks is : "+sum);

		//Display Lowest & Highest marks
		System.out.println("\nlowest marks is : "+ lowest);
		System.out.println("\nhighest mark is : "+ highest);
		
		//display marks greater than 40
		System.out.print("\nMarks greater than 40 : ");
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]>40)
			{
				int highMarks = marks[i];
				System.out.print(highMarks+ " ");
			}
		}
		
	}	

}
