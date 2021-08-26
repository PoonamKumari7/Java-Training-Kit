package techment.Day4.Polymorphism;

/**  Program to understand Overriding and how upcasting works */

class Bank	//parent class
{
	public void rateOfInterest()
	{
		System.out.println("3%");
	}

	public void openAccount()
	{
		System.out.println("Above age 18 can open the account!");
	}

}

class SBI extends Bank	//child class
{

	@Override
	public void rateOfInterest()
	{
		System.out.println("5%");
	}
}

class AXIS extends Bank	//child class
{

	public void rateOfInterest()
	{
		System.out.println("7%");
	}
}


public class Demo3_Overriding {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		AXIS axis = new AXIS();

		sbi.rateOfInterest();
		axis.rateOfInterest();

		System.out.println("-------------------");

		Bank bank1 = new SBI(); //Upcasting
		bank1.rateOfInterest();
		bank1.openAccount();
		
		System.out.println("-------------------");

		Bank bank2 = new AXIS(); //Upcasting
		bank2.rateOfInterest();
		bank2.openAccount();


	}

}
