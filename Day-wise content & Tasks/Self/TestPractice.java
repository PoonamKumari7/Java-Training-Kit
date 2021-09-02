package techment.self;

public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total+= letters.substring(1,2).length();
		total+= letters.substring(6,6).length();
		total+= letters.substring(6,5).length();
		System.out.println(total);
	}

}
