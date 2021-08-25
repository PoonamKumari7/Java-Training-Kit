package techment.Day7.CollectionFramework;

import java.util.Stack;

public class Demo11_Stack {

	public static void main(String[] args) {


		Stack s1 = new Stack();
		
		s1.push(1);
		s1.add(2);
		s1.add(3);
		
		System.out.println("Elements of the stack : "+ s1);
		System.out.println("Top element : "+ s1.peek());
		
		s1.pop();
		System.out.println("After removing element 1st time : "+s1); //Follow LIFO 
		System.out.println("Top element : "+ s1.peek());
		
		s1.pop();
		System.out.println("After removing element 2nd time : "+s1);
		System.out.println("Top element : "+ s1.peek());
		
		s1.pop();
		System.out.println("After removing element 3rd time : "+s1);
		//System.out.println("Top element : "+ s1.peek()); //Exception occurs bz stack is Empty
		
	}

}
