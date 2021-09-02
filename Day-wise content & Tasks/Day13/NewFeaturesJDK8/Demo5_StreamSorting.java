package techment.Day13.NewFeaturesJDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5_StreamSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(20);
		
		System.out.println(" list : "+nums);
		
		nums.forEach(s->System.out.println(s));
		
		nums.forEach(System.out::println);
		
		System.out.println("After Sorting");
		nums.stream().sorted().forEach(System.out::println);
		
		List<Integer> mySorted = nums.stream().sorted().collect(Collectors.toList());
		System.out.println(mySorted);
		
		
		List<Integer> myReverse = nums.stream().sorted()(Comparator.reverseOrder().collect(Collectors.toList());
		System.out.println(myReverse);
		
	}

}
