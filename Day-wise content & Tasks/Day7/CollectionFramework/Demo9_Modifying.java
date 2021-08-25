package techment.Day7.CollectionFramework;

import java.util.ArrayList;

public class Demo9_Modifying {

	public static void main(String[] args) {

		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("Elements of o1 are : " +o1);
		
		for(int i : o1)
		{
			if(i > 3)
				o1.remove(2);
				System.out.println(i);
				//o1.add(100);  //can't do concurrent modification
		}

	}

}
