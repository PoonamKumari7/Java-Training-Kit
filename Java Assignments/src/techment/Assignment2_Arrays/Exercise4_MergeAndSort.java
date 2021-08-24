package techment.Assignment2_Arrays;

import java.util.Arrays;
import java.util.Scanner;;

public class Exercise4_MergeAndSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//1st Array
		System.out.print("Enter the 1st Array size : ");
		int size1 = scanner.nextInt();

		int array1[] = new int[size1];
		System.out.println("Enter the 1st Array elements : ");
		for(int i=0; i<size1; i++)
		{
			array1[i] = scanner.nextInt();
		}
		System.out.print("Array1 : [ ");
		for(int j=0; j<array1.length; j++)
		{
			int a1 = array1[j];
			System.out.print(a1+ " ");	
		}
		System.out.print("]");

		//2nd Array
		System.out.print("\n\nEnter the 2nd Array size : ");
		int size2 = scanner.nextInt();

		int array2[] = new int[size2];
		System.out.println("Enter the 2nd Array elements : ");
		for(int i=0; i<size2; i++)
		{
			array2[i] = scanner.nextInt();
		}
		System.out.print("Array2 : [ ");
		for(int j=0; j<array2.length; j++)
		{
			int a2 = array2[j];
			System.out.print(a2+ " ");	
		}
		System.out.print("]");
		
		//merge the Array
		int merge = array1.length + array2.length;
		int[] result = new int[merge];
		
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		
		System.out.println("\n\nArray after merging : " +Arrays.toString(result));
		
		//Sorting an array
        int temp = 0;    								 
        for (int i = 0; i < result.length; i++)   		 
         {     
            for (int j = i+1; j < result.length; j++)     
            {     
               if(result[i] > result[j]) 					
               {    
                   temp = result[i];    
                   result[i] = result[j];    
                   result[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
  
        //print Array after sorting
        System.out.print("Merged Array after sorting : [ ");    
        for (int i = 0; i < result.length; i++) 
        {     
           System.out.print(result[i] + " "); 
        }    
       System.out.print("]");
	}

}
