package techment.Day3;

public class Demo12_Static {

	static
	{
		System.out.println("This is Static Block 1");
	}
	
	public static void main(String[] args) {

		System.out.println("This is the main");

	}
	
	static
	{
		System.out.println("This is Static Block 2");
	}

}
