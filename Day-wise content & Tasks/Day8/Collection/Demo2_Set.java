package techment.Day8.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo2_Set {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); //does not maintains insertion order
		hs.add(1);
		hs.add(6);
		hs.add(6); //removes duplicates
		hs.add(70);
		hs.add(11);
		hs.add(26);
		
		System.out.println("Hashset : " +hs);
		
		LinkedHashSet lhs = new LinkedHashSet(); //maintains insertion order
		lhs.add(1);
		lhs.add(6);
		lhs.add(6); //removes duplicates
		lhs.add(70);
		lhs.add(11);
		lhs.add(26);
		lhs.add("Poonam");
		
		System.out.println("Linked Hashset : " +lhs);

		TreeSet ts = new TreeSet(); //by default sorts in ascending order
		ts.add(1);
		ts.add(6);
		ts.add(6); //removes duplicates
		ts.add(70);
		ts.add(11);
		ts.add(26);
		//ts.add("Poonam"); //can't store diff type obj throws ClassCastException
		
		System.out.println("Tree set : " +ts);
		
	}

}
