package techment.Day13.NewFeaturesJDK8;

@FunctionalInterface
interface LargeNumber
{
	int findLarge(int a, int b , int c);
}

class CalculationutilLarge
{
	int findLargest(int a, int b, int c)
	{
		if(a>b && a>c )
			return a;
		else if(b>a && b>c)
			return b;
		else 
			return c;	
	}
}

public class Task1_MethodReference {

	public static void main(String[] args) {
		
		//Lambda 
		LargeNumber largestNumber =(a,b,c) ->                        
		{
			if(a>b && a>c )
				return a;
			else if(b>a && b>c)
				return b;
			else 
				return c;				
		};
		
		System.out.println(largestNumber.findLarge(6, 1, 8));
		
		//Method reference
		CalculationutilLarge calculationutil = new CalculationutilLarge();
		LargeNumber largenumber = calculationutil::findLargest;
		System.out.println(largenumber.findLarge(7, 8, 9));

	}

}
