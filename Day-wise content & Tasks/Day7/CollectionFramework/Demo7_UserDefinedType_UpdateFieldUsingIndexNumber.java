package techment.Day7.CollectionFramework;

import java.util.ArrayList;

//Method-1 Program to update any fields of collection using index number

class Employee1
{
	int id;
	String name;
	String dept;
	
	//Generating constructor in order to initialize values
	public Employee1(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}	
}


public class Demo7_UserDefinedType_UpdateFieldUsingIndexNumber {

	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1(1, "Sachin", "hr"); // Creating object of Employee type & assigning values
		Employee1 emp2 = new Employee1(2, "Ravi", "hr");
		
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee1(3,"Saurabh", "Developer")); //Another way of adding values to the object directly & call constructor
		
		//For printing the values
		for (Employee1 emp : employees) //employees is ArrayList  
		{
			System.out.println(emp.id+" "+ emp.name+" "+ emp.dept);
		}

		//1st way of updating any fields that we can update it via index number
		employees.set(1, new Employee1 (100, "Mahesh", "Saurabh")); //1st way
		
		for (Employee1 emp : employees) 
		{
			System.out.println(emp.id+" "+ emp.name+" "+ emp.dept);
		}
		
		
	}

}
