package techment.Day3;

/**
 * 
 * @author POONAM
 * id
 * name
 * contact
 * minBalance
 * 
 * create 3 objects
 * 
 * 1- initialize the values through constructor
 * 2- make a function with display customer details
 * 3- make a function to check account type
 * 			minBalance = 0	-> zero balance account
 *			minBalance = 1000	-> savings account
 *			minBalance = 10000	-> current account
 *
 */

class Customer
{
	int id;
	String name;
	String contact;
	int minBalance;

	public Customer(int id, String name, String contact, int minBalance) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.minBalance = minBalance;
	}

	public void displayCustomerdetails() {

		System.out.println("\nCustomer id : "+id+" | Customer name : "+name+" | Customer contact : "+contact+" | Minimum balance : "+minBalance);
		if(minBalance==0)
			System.out.println(name+" You have ZERO BALANCE ACCOUNT !");
		else if(minBalance==1000)
			System.out.println(name+" You have SAVINGS ACCOUNT !");
		else if(minBalance==10000)
			System.out.println(name+" You have CURRENT ACCOUNT !");			

	}

}

public class Task11_CustomerClass {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1, "Poonam", "1234567890", 1000);
		Customer customer2 = new Customer(7, "Ashiya", "0987645123", 10000);
		Customer customer3 = new Customer(2, "Omkar", "2134678901", 0);

		customer1.displayCustomerdetails();
		customer2.displayCustomerdetails();
		customer3.displayCustomerdetails();

	}

}
