package techment.Day11;

public class Demo1_EaqualIsIgnoreCase {

	public static void main(String[] args) {
		
		String str1 = "hello java";
		String str2 = "hello java";
		
		System.out.println(str1.equals(str2));
		
		//equals() : matches the letters with cases
		//equalIsIgnoreCase() : ignores the cases & matches only letters
		
		String str3 = "hello java";
		String str4 = "HELLO JAva";
		
		System.out.println(str3.equalsIgnoreCase(str4));

	}

}
