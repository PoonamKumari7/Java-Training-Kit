package techment.Day12.NewFeaturesJDK8;

import java.util.ArrayList;

public class Demo6_Stream {

	public static void main(String[] args) {
	
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(20);
		
		System.out.println(" list : "+nums);
		
		nums.stream().forEach(i->System.out.println(i)); //return collection of obj/stream as result (Lambda expression)
		
		nums.stream().forEach(System.out::println); // Method reference
		
		
	}

}
