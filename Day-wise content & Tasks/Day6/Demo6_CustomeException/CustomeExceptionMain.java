package techment.Day6.Demo6_CustomeException;

public class CustomeExceptionMain {

	public static void main(String[] args) {

		Account account = new Account();

		//to prevent this line from Insufficient fund exception wrap this method under try catch block
		try {
			System.out.println(account.withdraw(2000000)); 
		}
		catch(InsufficientFundException e)
		{
			//System.out.println("Insufficient fund !");	
			System.out.println(e.getMessage());
		}

		//no exception here
		System.out.println(account.withdraw(2000));

	}

}
