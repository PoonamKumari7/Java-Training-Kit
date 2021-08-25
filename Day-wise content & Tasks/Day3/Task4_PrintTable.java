package techment.Day3;

import java.util.Scanner;

public class Task4_PrintTable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Table you want to print : ");
		int n = scanner.nextInt();
		System.out.print("Enter the limit : ");
		int limit = scanner.nextInt();
		
		for(int i=1; i<=limit; i++)
		{
			System.out.println(n+" * "+i+ " = "+n*i);
		}
		

	}

}
