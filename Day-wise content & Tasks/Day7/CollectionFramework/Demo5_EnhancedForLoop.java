package techment.Day7.CollectionFramework;

import java.util.ArrayList;

public class Demo5_EnhancedForLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("Elements of o1 are : " +o1);
		
		//collection containing integer type elements, it can be user defined also. for ex Employee type for employee obj
		
		for(Integer o : o1) //or for(int o : o1)
		{
			System.out.println(o);
		}

	}

}
