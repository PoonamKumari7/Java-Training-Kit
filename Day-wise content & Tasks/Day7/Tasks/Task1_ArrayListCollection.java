package techment.Day7.Tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task1_ArrayListCollection {

	public static void main(String[] args) {


		ArrayList<String> Batch1 = new ArrayList<String>();
		
		Batch1.add("Sachin");
		Batch1.add("Ravi");
		Batch1.add("Kumar");
		Batch1.add("Saumya");
		
		System.out.println("Batch 1 Names : "+ Batch1) ;
		
		ArrayList<String> Batch2 = new ArrayList<String>();
		
		Batch2.add("Saurabh");
		Batch2.add("Manish");
		Batch2.add("Sachin");
		Batch2.add("Ankit");
		Batch2.add("Kumar");
		
		System.out.println("Batch 2 Names : "+ Batch2) ;
		
		//To Merge Batches
		Batch2.addAll(Batch1);
		System.out.println("\nNames after merging both Batches : \n"+ Batch2) ;
		
		//To remove
		Batch2.removeAll(Batch1);
		Batch2.addAll(Batch1);
		System.out.println("\nNames after removing duplicates names from batches : \n"+ Batch2) ;
		
		//To sort in ascending order
		Collections.sort(Batch2);
		System.out.println("\nNames in ascending order : \n"+ Batch2) ;
		
	}

}
