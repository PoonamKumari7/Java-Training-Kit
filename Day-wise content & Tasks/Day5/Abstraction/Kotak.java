package techment.Day5.Abstraction;

public class Kotak extends Bank {
	
	@Override
	int rateOfInterest(int interestRate) {
		
		//interestRate = 2*interestRate;
		System.out.println("Kotak Bank : "+interestRate);
		return interestRate ;
	} 	
}
