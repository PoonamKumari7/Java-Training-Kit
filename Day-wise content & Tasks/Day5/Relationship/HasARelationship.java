package techment.Day5.Relationship;

/** Program to understand Has-A Relationship */

class Employee 
{
	int id;
	String name;
	Address address; //object reference 

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void displayEmployeeInfo()
	{
		System.out.println("Id : "+ id);
		System.out.println("Name : "+ name);
		System.out.println("door number : "+ address.doorNo);
		System.out.println("Street name : "+ address.streetName);
		System.out.println("City : "+ address.city);
		System.out.println("Pincode : "+ address.pincode);

	}
}

class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;

	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
}

public class HasARelationship {

	public static void main(String[] args) {

		Address addr= new Address(101, "BTM", "Banglore", 560084);

		Employee employee = new Employee(1, "Poonam Kumari", addr);

		employee.displayEmployeeInfo(); 

	}
}
