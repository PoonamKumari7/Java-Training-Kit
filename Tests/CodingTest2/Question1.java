package techment.CodingTest2;

public class Question1 {

	public String repeatFront(String str, int n) 
	{
		String new_string = "";
		
		for (int i = n; n > 0; n--)
		{
		  new_string += str.substring(0,n);
		}
		return new_string;	
	}	

	public static void main(String[] args) {
		
		// creating object of class and calling repeatFront method
		
		Question1 test = new Question1();
		
		System.out.println(test.repeatFront("Chocolate", 4));
		System.out.println(test.repeatFront("Chocolate", 3));
		System.out.println(test.repeatFront("Ice Cream", 2));
		
	}

}