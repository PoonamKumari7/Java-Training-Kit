package techment.Day13.NewFeaturesJDK8;

@FunctionalInterface
interface Calculate
{
	int add(int a , int b);
}

class CalculationUtil
{
	int addition(int a, int b) {
		return a+b;
	}
	int subtraction(int a, int b)
	{
		return a-b;
	}
}


public class Demo2_MethodReference {

	public static void main(String[] args) {

		//by using lambda expression
		Calculate cal1 = (a,b) -> a+b;
		System.out.println(cal1.add(2, 4));
		
		Calculate cal2 = (a,b) -> a-b;
		System.out.println(cal2.add(4, 7));
		
		//by using Method reference
		CalculationUtil calculationUtil = new CalculationUtil(); //created obj 
		
		Calculate c1 = calculationUtil::addition;
		Calculate c2 = calculationUtil::subtraction;
		
		System.out.println(c1.add(2, 5));
		System.out.println(c2.add(4,7));
	
	}

}
