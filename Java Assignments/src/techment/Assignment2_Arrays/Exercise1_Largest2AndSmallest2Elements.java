package techment.Assignment2_Arrays;

import java.util.Scanner;

public class Exercise1_Largest2AndSmallest2Elements {

	public static void main(String[] args) {
		
		/* Program to find the largest 2 numbers and the smallest 2 numbers in the given array. */
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter size of the Array : ");
        int array_size = scanner.nextInt();
 
        if (array_size>=4)
        {
		int array[] = new int[array_size];
		
		int smallest1 = array_size, smallest2, largest1 = 0, largest2=0;
        System.out.println("\nEnter "+ array_size +" elements in Array : ");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scanner.nextInt();
			
			if(array[i]>largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			if(array[i]>largest2 && array[i]!=largest1)
				largest2 = array[i];

			if(array[i]<smallest1)
			{
				smallest1 = array[i];
			}
			for(int j=0; j<array_size; j++)
			{
				for(int k=j+1; k<array_size; k++)
				{
					int temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
				
			}
		}
		
		smallest2 = array[array_size-2];
	
		System.out.println("\nFirst largest element of the Array is " + largest1);
		System.out.println("Second largest element of the Array is " + largest2);
		System.out.println("\nFirst smallest element of the Array is " + smallest1);
		System.out.println("Second smallest element of the Array is " + smallest2);
       }
        else
        	System.out.println("\nPlease enter atleast 4 elements in Array!");
	}
}