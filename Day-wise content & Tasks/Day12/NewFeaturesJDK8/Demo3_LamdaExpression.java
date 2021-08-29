package techment.Day12.NewFeaturesJDK8;

interface Bank2
{
	void display();
}

public class Demo3_LamdaExpression {

	public static void main(String[] args) {

		Bank2 bank1 = () -> System.out.println("display method"); //single line comment bank1 reference variable
		bank1.display();
		
		Bank2 bank2 = () -> 
		{
			System.out.println("Display method");       //multiline comment
			System.out.println("Multiline comment");
		};
		bank2.display();
		
	}
}

