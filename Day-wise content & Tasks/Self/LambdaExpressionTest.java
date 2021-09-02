package techment.self;

interface LambdaExpr
{
	void getValue(int a, int b);
}
public class LambdaExpressionTest{

	public static void main(String[] args) {
		
		LambdaExpr lambda_obj = (a,b) -> {
			System.out.println("Values of a and b are : "+ a +", "+ b);
	};
	lambda_obj.getValue(7, 4);
  }
}
