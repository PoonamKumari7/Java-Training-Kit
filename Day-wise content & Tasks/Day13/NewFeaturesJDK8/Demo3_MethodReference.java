package techment.Day13.NewFeaturesJDK8;
/**
@FunctionalInterface
interface Calculate4
{
	static int add(int a , int b);
}

class CalculationUtil
{
	int addition(int a, int b) {
		return a+b;
	}
	static int subtract(int a, int b)
	{
		return a-b;
	}
}




public class Demo3_MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculationUtil calculationUtil = new CalculationUtil();
		Calculate c1 = calculationUtil:: addition;
		System.out.println(c1.add(1, 1));
		
		Calculate c2 = CalculationUtil::Subtract;
		c2.add(2,2);
	}

}*/
