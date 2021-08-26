package techment.Day5.Abstraction;

public class AXIS extends Bank {
	
	//when any class extends the abstract class, it needs to provide the implementation for abstraction

	@Override
	int rateOfInterest(int interestRate) {
		
		interestRate = 2*interestRate;
		System.out.println("AXIS Bank : "+interestRate);
		return interestRate ;
	} 

	
}
