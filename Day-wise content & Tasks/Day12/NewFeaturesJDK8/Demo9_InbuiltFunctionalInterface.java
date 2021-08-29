package techment.Day12.NewFeaturesJDK8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo9_InbuiltFunctionalInterface {

	public static void main(String[] args) {
		
		/** 1. Predicate */
		
		Predicate<Integer> predicate = (num) -> num >18;
		System.out.println(predicate.test(20));
		
		Predicate<String> strPredicate = (name) -> name.contains("a");
		//System.out.println(strPredicate.test("POONAM")); //it is unable to compare with cases, so FALSE
		System.out.println(strPredicate.test("poonam")); //true
		
		/** 2. Function */
		
		Function<Integer, Integer> function1 = (num1) -> num1;
		Function<Integer, String> function2 = (num1) -> "value of num1 : "+num1;
		Function<String, Integer> function3 = (name) -> name.length();
		
		System.out.println(function1.apply(2));
		System.out.println(function2.apply(4));
		System.out.println(function3.apply("Poonam"));

	}

}
