package techment.Day7.CollectionFramework;

import java.util.LinkedList;

public class Demo10_LinkedList {

	public static void main(String[] args) {
		
		//creating object of Linked list type
		LinkedList o1 = new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.addFirst(100); //Add at the beginning of the linked list
		o1.addLast(200);  //Add at the last of linked list before insertion new element
		System.out.println("Elements in the linked list are : "+o1);
		
		o1.add(33);
		o1.add(40);
		System.out.println("After adding : "+o1);
		
		o1.remove(); //removes first element from the list
		System.out.println("After removing : "+o1);
		
		//getting first element of the linked list without removing it from the list
		//returns Null if list is empty
		System.out.println("Top element of the linked list : " +o1.peek());  
		System.out.println("Top element of the linked list : " +o1.peekFirst()); 	
		
	}

}
