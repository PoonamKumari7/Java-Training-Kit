package techment.Day7.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* Program to iterate collection using Iterator */

public class Demo4_Iterator {

	public static void main(String[] args) {

		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("Elements of o1 are : " +o1);
		
		Iterator<Integer> itr = o1.iterator();
		
		//iterator goes always in forward direction
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
		
	}

}
