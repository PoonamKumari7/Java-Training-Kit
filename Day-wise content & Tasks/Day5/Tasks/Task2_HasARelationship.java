package techment.Day5.Tasks;

/** Task -2 Has-A Relationship */

class Customer
{
	int cust_id;
	String cust_name;
	Account account;

	public Customer(int cust_id, String cust_name, Account account) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.account = account;
	}

	void displayCustomerDetails()
	{
		System.out.println("Customer ID : "+cust_id);
		System.out.println("Customer name : "+cust_name);
		System.out.println("Customer account number : "+account.account_no);
		System.out.println("Customer Account type : "+account.account_type);
		System.out.println("Customer Account balance : "+account.balance);
		System.out.println("Customer IFSC Code : "+account.IFSCcode);
		System.out.println("Customer Account branch : "+account.branch);

	}
}

class Account
{
	int account_no;
	String account_type;
	double balance;
	String IFSCcode;
	String branch;

	public Account(int account_no, String account_type, double balance, String IFSCcode, String branch) {
		super();
		this.account_no = account_no;
		this.account_type = account_type;
		this.balance = balance;
		this.IFSCcode = IFSCcode;
		this.branch = branch;
	}
}

public class Task2_HasARelationship {

	public static void main(String[] args) {

		Account account = new Account(100894567, "Savings", 57999.45, "SBIN0125620", "SBI Sector-9");

		Customer customer = new Customer(1, "Poonam Kumari", account);

		customer.displayCustomerDetails();

	}

}
