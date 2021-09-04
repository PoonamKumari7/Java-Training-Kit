package techment.Assignment1;

import java.util.Scanner;

public class Exercise9_FirstNTerm {

	public static void main(String[] args) {
		
		/* program to accept a number n, and display the first n numbers from the above
		series. */
		
		int d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n term : ");
		int n = scanner.nextInt();
		
		int[] series = {1,8,27,64,125};
		
		System.out.print("First "+n+" numbers of the series are :");
		for(int i=0; i<n; i++)
		{
			int store = series[i];
			System.out.print(" " +store);
		}
		
		
		
	}

}
