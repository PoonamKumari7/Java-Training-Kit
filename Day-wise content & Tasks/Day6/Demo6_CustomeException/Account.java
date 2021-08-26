package techment.Day6.Demo6_CustomeException;

public class Account {
	
	int balance = 5000;
	
	String withdraw(int amount)
	{
		if(amount>balance)
			throw new InsufficientFundException("Insufficient fund");
		else
			return "You have withdrawn " +amount+ " amount";
	}

}
