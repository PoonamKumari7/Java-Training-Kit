package techment.Day7.CollectionFramework;

import java.util.ArrayList;

/* Program to understand how Array list's default size is initialized & increased */

public class Demo2_ArrayList {

	public static void main(String[] args) {


		ArrayList a1 = new ArrayList(); //can store any type of object
		a1.add(1);
		a1.add("Poonam");
		System.out.println("First list : " +a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(); //can store only Integer type of object & default capacity is 10 
		a2.add(2);
		a2.add(3);
		//a2.add("Ashiya"); //can't hold string type
		System.out.println("Second list : " +a2);
		
		ArrayList<String> a3 = new ArrayList<String>(100); //default capacity updated to 100  
		a3.add("Mahima");
		a3.add("Narayan");
		System.out.println("Third list : " +a3);		

	}

}
