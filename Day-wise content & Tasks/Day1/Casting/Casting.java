package techment.Day1.Casting;

public class Casting {

	public static void main(String[] args) {
		
		int salary = 30000;
		double salary1 = salary; //Storing smaller type to larger
		
		System.out.println(salary);
		System.out.println(salary1);
		
		double interestRate = 200.45;
		int interestRate2 = (int) interestRate;
		
		System.out.println("interestRate "+ interestRate);
		System.out.println("interestRate2 "+ interestRate2);
		
	}

}
