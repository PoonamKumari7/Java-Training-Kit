package techment.Day4.OOPs;

public class Employee extends Person {
	
	String designation;
	String companyName;
	
	void displayEmployeeDetails()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Designation : "+designation);
		System.out.println("Company Name : "+companyName);		
		
	}

}
