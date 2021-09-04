package techment.Assignment1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** Program for generating permutations without repetition */

public class Exercise42_PermutationOfStrings {

	static Set<String> hash_Set = new HashSet<>();

	//method to generating permutations of the string
	static void Permutation(String str, String ans)
	{
		if (str.length() == 0) {

			//Adding generated permutation to set in order to avoid duplicates
			hash_Set.add(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of string(str)
			char ch = str.charAt(i);

			//string after excluding ith character
			String ros = str.substring(0, i)
						+ str.substring(i + 1);

			//recursive calling
			Permutation(ros, ans + ch);
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scanner.next();
		String s1 = s.toUpperCase();
		//String s = "CAT";

		//Generating permutations
		Permutation(s1, "");

		//Printing generated permutations
		System.out.println("\nPermutations of "+s1+" is : \n");
		hash_Set.forEach((n) -> System.out.println(n));
	}
}


/** Program for generating permutations with repetition */

//public class Exercise42_PermutationOfString {
//
//	public static void main(String[] args) {
//
//		 permutationWithRepeation("CAT");
//
//	}
//
//	private static void permutationWithRepeation(String str1) {
//		  System.out.println("The given string is : CAT");
//		  System.out.println("The permuted strings are:");
//		  showPermutation(str1, "");
//		 }
//	private static void showPermutation(String str1, String NewStringToPrint) {
//
//		  if (NewStringToPrint.length() == str1.length()) {
//		   System.out.println(NewStringToPrint);
//		   return;
//		  }
//		  for (int i = 0; i < str1.length(); i++) {
//
//		   showPermutation(str1, NewStringToPrint + str1.charAt(i));
//		  }
//		 }
//	}


