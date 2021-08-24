package techment.Assignment4_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author POONAM
 * 1 – Student Marks
Create a Class StudentMarks with a main method. Use Scanner to accept marks scored by Students.

Add the marks to an ArrayList. (two or more students can have the same marks)
Display the highest mark scored by the student.
Display the Average marks scored by the Students
Display the marks stored by the 3rd Student
Sort the marks and display the marks using Iterator.

Sample Input
Enter number of Students
4
Enter Marks
40 60 60 50 

Sample Output
Highest Marks : 60
Average Marks : 52.5
Marks 	: 1-40 2-60 3-60 4-50
3rd Student marks : 60
Sorted 	: 1-40 2-50 3-60 4-60

 */

public class Exercise1_StudentMarks {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of Students : ");
		int total_number = scanner.nextInt();
		
		ArrayList<Integer> student_marks = new ArrayList<Integer>(total_number);
		
		int sum = 0;
		System.out.println("Enter Marks : ");
		for(int i=0; i < total_number; i++)
		{
			int num2 = scanner.nextInt();
			
			student_marks.add(num2);
			
			sum+= num2;	
		}
		
		/************************Highest Marks***********************************/
		System.out.println();
		System.out.println("Highest Marks : "+ Collections.max(student_marks));
		
		
		/**********************Average Marks**********************************/
		double average = sum / total_number;
		System.out.println("Average Marks : "+ average );
		
		/*********************Display Marks*********************************/
		
		System.out.print("Marks : ");
		for(int i=0; i<student_marks.size(); i++)
		{
			System.out.print((i+1)+"-"+student_marks.get(i) + " ");
		}
		/*********************3rd Student marks***************************/
		
		System.out.println("\n3rd Student marks : " +student_marks.get(2));
		
		/******************Marks in Sorted order*************************/
	
		Collections.sort(student_marks);
		Iterator<Integer> itr = student_marks.iterator();
		
		
		System.out.print("Sorted : ");
		while(itr.hasNext())
		{
			for(int i=0; i<total_number; i++)
			System.out.print((i+1)+"-"+ itr.next()+ " ");
		}		
		
	}
}
