package techment.Day7.CollectionFramework;

import java.util.ArrayList;

/* Program to show employee list with User defined type */

class Employee
{
	int id;
	String name;
	String dept;
	
	//Generating constructor in order to initialize values
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}	
}

public class Demo6_UserDefinedType {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Sachin", "hr"); // Creating object of Employee type & assigning values
		Employee emp2 = new Employee(2, "Ravi", "hr");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"Saurabh", "Developer")); //Another way of adding values to the object directly & call constructor
		
		//printing the values
		for (Employee emp : employees) //employees is ArrayList  
		{
			System.out.println(emp.id+" "+ emp.name+" "+ emp.dept);
		}
		
	}

}
