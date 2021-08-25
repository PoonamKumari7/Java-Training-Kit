package techment.Day7.CollectionFramework;

import java.util.ArrayList;                   //for collection need to import util package

/* Program to understand how Array list uses Dynamic Array to store the elements */

public class Demo1_ArrayList {

	public static void main(String[] args) {
		
		 //int a = 1;
		//Integer b = a;                    //integer a is converted to object type (Wrapper class) 
		
		ArrayList obj = new ArrayList(); //can store any type of object and default memory allocated is 0-9
		
		System.out.println("Size before adding elements : "+obj.size()); //checking size of the list
		
		obj.add(1);   			      //converts integer 1 directly to the object
		obj.add("Poonam");
		obj.add(31.70);
		obj.add(0, "Ruchika");      //insert element at 0th place & increases size of list automatically
		obj.add(0, 4);             //insert element at 0th place & shifts Ruchika to the 1st place
		
		System.out.println("Elements in the list after insertion : "+ obj);
		System.out.println("Size after adding elements : "+obj.size());
		
		//obj.clear();          //clear all the element of the lists
		
		System.out.println("Elements in the list are : "+ obj);
		System.out.println("Size after clearing elements : "+obj.size());
		
		obj.remove(4);      //removes 4th index element 
		System.out.println("Elements in the list after deletion : "+ obj);
		
		obj.remove(Integer.valueOf(1)); //while calling remove taking integer but To delete specific element, need to convert it to object type (Integer type)
		System.out.println("Elements after removing elements : "+obj);
		
		//retrieving elements from the array list
		System.out.println("Elements at the 2nd index : " + obj.get(2));
				
	}

}

