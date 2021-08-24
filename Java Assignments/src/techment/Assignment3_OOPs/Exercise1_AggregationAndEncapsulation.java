package techment.Assignment3_OOPs;

class Address
{
	private String addressLine;
	private String City;
	
	public Address(String addressline, String city) {
		super();
		setAddressline(addressline);
		setCity(city);
	}
	public String getaddressLine() {
		return addressLine;
	}
	public void setAddressline(String addressline) {
		addressLine = addressline;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void getAddressDetails()
	{
		System.out.print(getaddressLine() + " , "+getCity());
	}
	
}

class Customer
{
	private String customerName ;
	private Address residentialAddress ;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	 
	public void getCustomerDetails () {
		System.out.println("Customer : "+customerName);
		System.out.println("Residential Address : " + residentialAddress.getaddressLine() + ", "+ residentialAddress.getCity() );
	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}	
}

public class Exercise1_AggregationAndEncapsulation {

	public static void main(String[] args) {
		
		Address address = new Address("1st Main HSR Layout", "Banglore");
		Customer customer = new Customer("John", address);
		customer.getCustomerDetails();

	}

}
