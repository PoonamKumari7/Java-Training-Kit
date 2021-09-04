package techment.Assignment1;

import java.util.Stack;

public class Exercise41_StackImplementation {

	public static void main(String[] args) {
		
		Stack stack= new Stack();
		stack.push(10);
		stack.add(20);
		stack.add(30);
		
		System.out.println("Elements Pushed into Stack : " +stack);
		System.out.print("\n");
		int i=3;
		while(i>0)
		{
			System.out.println("Item POPPED is : "+stack.peek());
			stack.pop();
			i--;
		}


	}

}
