package techment.Day12.NewFeaturesJDK8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7_Stream {

	public static void main(String[] args) {

		// filter() : filtering values from list on the basis of condition

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for(int i=0; i<=10; i++)
		{
			numbers.add(i);
		}

		System.out.println("Numbers : "+numbers);

		/*************************************************************************************/
		//filter gives boolean values
		System.out.println("Printing even numbers");
		numbers.stream().filter(num->num%2==0).forEach(s->System.out.println(s));

		/**********************************************************************************/
		//for printing in list by putting elements directly to array
		List<Integer> nu = Arrays.asList(1,6,7,8,9);
		System.out.println(nu);

		//intermediate : map takes input gives output
		numbers.stream().map(num->"After adding 100 : "+(num + 100)).forEach(s->System.out.println(s));

	}

}
