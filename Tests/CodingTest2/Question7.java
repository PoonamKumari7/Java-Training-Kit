package techment.CodingTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {	
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of ArrayList : ");
		int n = scanner.nextInt();
		
		System.out.println("\nPlease enter Elements in ArrayList : ");
		for(int i=0; i<n ; i++)
		{
			int elements = scanner.nextInt();
			list.add(elements);
			
		}
		
		System.out.println("\nTotal number of elements in the list : " +list.size());
		
		if(list.size()%2==0)
		{
			List<Integer> onepart = list.subList(0, (list.size()/2));
			List<Integer> secondpart = list.subList((list.size()/2), (list.size()));
			System.out.println("\nElements of the list after division : " +onepart+ "," +secondpart);
			System.out.println("\nMaximum element in 1st Part of the list : " +Collections.max(onepart));
			System.out.println("Maximum element in 2nd Part of the list : " +Collections.max(secondpart));
		}
		
		else
		{
			List<Integer> onepart = list.subList(0, (list.size()/2)+1);
			List<Integer> secondpart = list.subList((list.size()/2)+1, (list.size()));
			System.out.println("\nElements of the list after division : " +onepart+ "," +secondpart);
			System.out.println("\nMaximum element in 1st Part of the list : " +Collections.max(onepart));
			System.out.println("Maximum element in 2nd Part of the list : " +Collections.max(secondpart));
		}			
	}

}
