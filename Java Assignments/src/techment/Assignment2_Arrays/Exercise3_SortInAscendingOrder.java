package techment.Assignment2_Arrays;

import java.util.*;

public class Exercise3_SortInAscendingOrder {

	public static void main(String[] args) {
		
		/* Program which takes 10 integer in an array and sort in ascending order. */
		
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = scanner.nextInt();
        System.out.print("\n");
        
        //Array Declaration
        int array[]=new int[size]; 
        
        //Array Initialization
        for(int i=0; i<size; i++)    
        {
        	System.out.print("Enter the "+(i+1)+" element of the Array : ");
            array[i]=scanner.nextInt();
        }
        
        //Sorting an array
        int temp = 0;    								 
        for (int i = 0; i < array.length; i++)   		 
         {     
            for (int j = i+1; j < array.length; j++)     
            {     
               if(array[i] > array[j]) 					
               {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying array elements after sorting    
        System.out.println("Elements of array are sorted in ascending order: ");    
        for (int i = 0; i < array.length; i++) 
        {     
            System.out.print(array[i] + " ");    
        }    
    }
}

		
