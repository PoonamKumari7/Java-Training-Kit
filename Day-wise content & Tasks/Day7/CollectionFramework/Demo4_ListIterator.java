package techment.Day7.CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

/* Program to iterate collection in forward & backward direction using List Iterator */

public class Demo4_ListIterator {

	public static void main(String[] args) {

		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("Elements of o1 are : " +o1);
		
		ListIterator<Integer> list_itr = o1.listIterator();
		
		System.out.println("Forward direction"); //traverse cursur in forward direction
		while(list_itr.hasNext()) 
		{
			System.out.println(list_itr.next());
		}
		
		
		System.out.println("Backward direction");
		while(list_itr.hasPrevious()) //traverse cursur in Backward direction
		{
			System.out.println(list_itr.previous());
		}
		
	}

}
