package techment.Assignment1;

import java.util.*;

public class Exercise7_WhoAreGoingForBattle {

	public static void main(String[] args) {
		
		/* Program to display the soldiers whose numbers are between the first and the last
		number that the king calls out. Using For loop */
		
		//Creating object of Scanner class 
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Total number of soldiers : \n");
		int n = scanner.nextInt();
		
		System.out.println("\nNumber the soldiers : ");
		int numbered_soldiers[] = new int[n];
		int first, last;
		
		for(int i=0; i<n; i++)
		{
			numbered_soldiers[i] = scanner.nextInt();
		}
		first = numbered_soldiers[0];
		last = numbered_soldiers[n-1];
		
		System.out.println("\nFirst Soldier : " +first);
		System.out.print("Last Soldier : " +last);
		
		System.out.println("\n");
		System.out.println("King calls out the soldiers for the battle are : "); //in between "+first+ " and "+last+ " : ");
		
		for(int i=0; i<n; i++)
		{
			if(numbered_soldiers[i]>=first && numbered_soldiers[i]<=last || numbered_soldiers[i]>=last && numbered_soldiers[i]<=first)
			{
				int temp=numbered_soldiers[i];
				System.out.println(temp);
			}
	
		}
		

	}

}
