package techment.Assignment1;

import java.util.Scanner;

public class Exercise11_PrintThePattern {

	public static void main(String[] args) {
		
		/* Print the pattern Using Nested For loop */

        Scanner scanner = new Scanner(System.in);

        int rows = 5;
        
        System.out.println("Printing the pattern...\n");
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

	


