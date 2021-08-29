package techment.Day12.NewFeaturesJDK8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_PrintingNamesWithCondition {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>(); //list to add string type element
		names.add("Sachin");
		names.add("Ravi");
		names.add("Kumar");
		names.add("Dhoni");

		List<ArrayList<String>> namesofall = Arrays.asList(names);
		System.out.println("Names : "+namesofall+ "\n");

		names.stream().filter(names1->names1.contains("a")).forEach(s->System.out.println("Names with char 'a' : " +s));

		names.stream().filter(lengthofnames->lengthofnames.length()>5).forEach(s->System.out.println("\nNames of length more than 5 : " +s));

	}

}
