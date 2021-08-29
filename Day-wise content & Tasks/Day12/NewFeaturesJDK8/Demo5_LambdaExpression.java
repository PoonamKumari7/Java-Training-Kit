package techment.Day12.NewFeaturesJDK8;

interface Calculation1
{
	int add(int a, int b);//functional interface with abstract method with int return type
}
public class Demo5_LambdaExpression {

	public static void main(String[] args) {
		
		Calculation1 calculation1 = (a,b)-> a+b; //single line body
		calculation1.add(3, 7);
		
		Calculation1 calculation2 =(a,b)-> //multiline body
		{
			if(a>b)
				return a;
			return b;
		};
		
		
		System.out.println("Addition od two numbers : " +calculation1.add(6,7));
		System.out.println("Largest of two number : "+calculation2.add(12,4));
		
	}

}
