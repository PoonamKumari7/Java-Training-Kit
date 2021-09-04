package techment.Assignment1;

import java.util.Scanner;

public class Exercise12_PrintThePattern {

	public static void main(String[] args) {

		/* Print the pattern */

		Scanner sc = new Scanner(System.in);
         
        System.out.println("Printing the pattern...\n");
        
        for(int i=1; i<=5; i++)
        {
        	for (int j=i; j<=5; j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1; j<=i; j++)
        	{
        	System.out.print(j+"");
        	}
        	for(int j=1; j<=i; j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
       
        
        for (int i = 5; i >= 1; i--) 
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
            
        }
        
    
         

	}

}
