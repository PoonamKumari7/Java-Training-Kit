package techment.Day4.Polymorphism;

public class Demo2_Overloading {

	public static void main(String[] args) {
		
		Hello2 hello2 = new Hello2();
		
		System.out.println("Addition of 3 numbers : "+hello2.addition(2, 4, 10));
		
		System.out.println("Addition of 2 numbers : "+ hello2.addition(10, 22));

	}

}
