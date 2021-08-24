package techment.Assignment2_Arrays;

import java.util.Scanner;

public class Exercise2_ElementIsPresentOrNot {

	public static void main(String[] args) {
		
		//int a[]= {1,4,34,56,7};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		System.out.println("\nEnter elements in Array : ");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scanner.nextInt();
		}	
		
		System.out.println("\nEnter the searching element : ");
		int n=scanner.nextInt();
		
		int c=0;
		for(int i=0;i<array.length; i++)
		{
			if(array[i]==n)
			{
				c=i+1;
				break;
			}
		}
		if(c!=0)
		{
			System.out.println("\nElement "+n+" is Present.");
		}
		else
			System.out.println("\nElement "+n+" is not Present !");

	}

}
