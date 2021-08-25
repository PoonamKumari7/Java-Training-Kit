package techment.Day7.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

/* Program to add, remove, retain and sort the elements of list using collection class utility methods */

public class Demo3_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("Elements of o1 are : " +o1);
		
		ArrayList<Integer> o2 = new ArrayList<Integer>();
		o2.add(100);
		o2.add(101);
		o2.add(102);
		
		System.out.println("Elements of o2 are : " +o2);
		System.out.println("----------------------------------------------------");
		
		o2.addAll(o1); //appending o1 elements to o2
		System.out.println("Elements after adding : " +o2);
		System.out.println("----------------------------------------------------");
		
		o2.removeAll(o1); //removing o1 elements from o2
		System.out.println("Elements after removing : " +o2);
		System.out.println("----------------------------------------------------");
		
		o2.add(3);
		o2.add(5);
		System.out.println("Elements after adding more elements : " +o2);
		System.out.println("----------------------------------------------------");
		
		o2.retainAll(o1);
		System.out.println("Elements after retaining : " +o2);
		System.out.println("----------------------------------------------------");
		
		Collections.sort(o2); //sorting o2 elements 
		System.out.println("Elements after sorting : " +o2);	

	}

}
