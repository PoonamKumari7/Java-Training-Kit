package techment.Day5.Abstraction;

public abstract class Bank {
	
	void eligibility()
	{
		System.out.println("Above 18 can open account!");
	}
	
	abstract int rateOfInterest( int interestRate);

}
