package techment.Day3;

class Employee
{
	int id;
	String name;
	String designation;
	static String companyName = "Techment";  

	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public void display()
	{
		System.out.println("company name : "+companyName);
		System.out.println("id "+id);
	}
}

public class Demo13_StaticKeywordInsideClass {

	public static void main(String[] args) {

		Employee employee1 = new Employee(100, "Manish", "CEO");
		Employee employee2 = new Employee(101, "Manoj", "Manager");
		Employee employee3 = new Employee(102, "Ajit", "Manager");

		Employee.companyName = "Techment technology"; //static keyword can be called by class name 
		//employee1.id=1;							 //overwrites the previous given value
		
		employee1.display();
		employee2.display();
		employee3.display();

	}

}
