package techment.Day12.NewFeaturesJDK8;

interface Calculation
{
	void add(int a, int b); //function interface with abstract method with no return type
}

public class Demo4_LamdaExpression {

	public static void main(String[] args) {
		
		//Lambda expression with parameter
		Calculation calculation = (a,b) -> System.out.println("Result : "+ (a+b));
		calculation.add(2, 5);
		calculation.add(8, 4);
		
	}

}
