package techment.Day4.OOPs;

/** Program to understand Is-A Relationship (Inheritance) */

public class InheritenceApp {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		//passing the values through objects
		//to Employee class
		employee.id = 1;   
		employee.name = "Poonam";
		employee.age = 25;
		employee.designation = "Developer";
		employee.companyName = "Techment";
		
		employee.displayEmployeeDetails();
		
		System.out.println("--------------------------------");
		
		Student student = new Student();
		
		//passing the values through objects
		//to Student class
		student.id = 2;   
		student.name = "Ruchika";
		student.age = 27;
		student.dept = "CSE";
		student.collegeName = "ABC University";
		
		student.displayStudentDetails();
		

	}

}
