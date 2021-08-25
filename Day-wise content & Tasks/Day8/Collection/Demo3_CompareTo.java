package techment.Day8.Collection;

public class Demo3_CompareTo {

	public static void main(String[] args) {

		
		//compares two string by subtracting char's ASCII value
		
		System.out.println("a".compareTo("a")); //97-97=0
		System.out.println("c".compareTo("a")); //97-99=2
		System.out.println("a".compareTo("c")); //99-97=-2 (-2 -1 0 1 2)

	}

}
