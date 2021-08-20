package techment.CodingPracticeTest;

import java.util.Scanner;

public class Question1_Array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many Person's age you want to enter : ");
		int n = scanner.nextInt();
		System.out.println();
		
		int child=0, adult=0, senier=0;
		int age[] = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter the "+ (i+1) +" person age : ");
			age[i] = scanner.nextInt();
			
			if(age[i]<18)
				child = child+1;
			else if(age[i]>=18 && age[i]<=54)
				adult += 1;
			else if(age[i]>=55)
				senier += 1;
			
		}
		
		System.out.print("\nPerson age : ");
		
		for(int i=0; i<age.length; i++)
		{
			System.out.print(age[i] + " ");
		}
	    
		System.out.println();
		System.out.print("\nNumber of children : " +child);
		System.out.print("\nNumber of Adults : " +adult);
		System.out.print("\nNumber of Senier citizen : " +senier);
		
	}
}


