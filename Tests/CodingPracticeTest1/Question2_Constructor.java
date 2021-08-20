package techment.CodingPracticeTest;

class Employee
{
	String first_name;
	String last_name;
	
	public Employee(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		
		System.out.println();
		System.out.println("Employee Full name is : " +first_name +" "+last_name);
		System.out.println();
		return "Employee first name is : " + first_name + "\nEmployee last name is : " + last_name;
	}
	
}

public class Question2_Constructor {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Poonam", "Kumari");
		System.out.print(employee.toString());
		
	}

}
