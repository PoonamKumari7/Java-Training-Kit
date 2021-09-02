package techment.self;

interface Secret
{
	String magic (double d);
}

class MySecret implements Secret
{
	public String magic(double d) {
		return "proof";
		
	}
}

public class TestPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Secret s = (e) -> 
		{
			String a = "Proof";
					return a;
					};
	}

}
