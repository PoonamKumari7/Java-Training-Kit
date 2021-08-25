package techment.Day1.Operator;

public class IncrementOperator {

	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println("a = "+ a);
		System.out.println("a = "+ (++a));  // ++a -> a = a+1 -> First increment then assign
										    // a++ -> a = a+1 -> First assign then increment
		
		System.out.println("a = "+ a);
		
		

	}

}
