package techment.Day13.NewFeaturesJDK8;

interface Calculation
{
	void display();
}

class Hello
{
	void message()
	{
		System.out.println("Today is Holiday");
	}
}

public class Demo1_MethodInterference {

	public static void main(String[] args) {

		Calculation calculation = () -> System.out.println("This is Display method");
		calculation.display();

		Hello calHello = new Hello();
		calHello.message();
		
	}

}
