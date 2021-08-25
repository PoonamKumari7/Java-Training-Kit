package techment.CodingTest2;

public class Question2 {

	public String repeatEnd(String str, int n) {

		String new_string = "";
		
		for (int i = 0; i < n; i++)
		{
			new_string += str.substring((str.length()) - n, str.length());
		}
		return new_string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question2 test = new Question2();
		
		System.out.println(test.repeatEnd("Hello", 3));
		System.out.println(test.repeatEnd("Hello", 2));
		System.out.println(test.repeatEnd("Hello", 1));
		
	}

}
