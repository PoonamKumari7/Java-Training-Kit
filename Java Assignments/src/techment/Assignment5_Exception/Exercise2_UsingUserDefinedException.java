package techment.Assignment5_Exception;

import java.util.Scanner;

/**
 * 
 * @author POONAM
 *2 – Using User-defined Exception
Create a class Customer having following members:

private String custNo
private String custName
private String category

Parameterized constructor to initialize all instance variables
Getter methods for all instance variables

Perform following validations in the constructor

•	custNo must start with ‘C’ or ‘c’
•	custName must be at least of 4 characters
•	category must be either ‘Platinum’, ‘Gold’ or ‘Silver ‘

When any of these validations fail, then raise a user defined exception InvalidInputException 

Create a class TestCustomer having main method.  Ask user to enter customer details.  Create an object of Customer and perform validations.  Print details of customer.
 */

class Customer {

	private String custNo;
	private String custName;
	private String category;

	@Override
	public String toString() {
		return "Customer [ custNo : " + custNo + ", custName : " + custName + ", category : " + category + " ]";
	}

	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();

		if(custNo.startsWith("C") || custNo.startsWith("c"))

		{
			if(custName.length()>=4)
			{
				if((category=="Gold") || (category=="Platinum") || (category=="Silver")) {

					this.custNo = custNo;
					this.custName = custName;
					this.category = category;	

				}else {
					throw new InvalidInputException("category must be either ‘Platinum’, ‘Gold’ or ‘Silver ‘");
				}

			}else {
				throw new InvalidInputException("custName must be at least of 4 characters");
			}

		}
		else {
			throw new InvalidInputException("custNo must start with ‘C’ or ‘c’");
		}
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}


class InvalidInputException extends Exception{
	InvalidInputException(String msg)
	{
		super(msg);
	}
}

public class Exercise2_UsingUserDefinedException {

	public static void main(String[] args) {
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Customer number : ");
			String cust_number = scanner.nextLine();

			System.out.print("Enter the Customer name : ");
			String cust_name = scanner.nextLine();

			System.out.print("Enter the category : ");
			String cust_catagory = scanner.next();
			
			Customer customer1 = new Customer(cust_number, cust_name, cust_catagory);
			//Customer customer1 = new Customer("c123","Poonam Kumari","Platinum");
			System.out.println("\n"+customer1);
		}
		catch(InvalidInputException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
