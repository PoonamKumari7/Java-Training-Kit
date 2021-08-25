package techment.Day7.CollectionFramework;

import java.util.ArrayList;

//Method-2 Program to update any fields of collection using getter setter method (Encapsulation)
//Benefits of using Encapsulation : Whoever set the values, only can update the values

class Employee2 // Employee2 is said as Model class
{
	// In model class, All fields are Private only
	private int id;      
	private String name;
	private String dept;
	
	//Generating constructor in order to initialize values
	public Employee2(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	//getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
public class Demo8_UserDefinedType_UpdateFieldUsingEncapsulation {

	public static void main(String[] args) {
		
		Employee2 emp1 = new Employee2(1, "Sachin", "hr");
		Employee2 emp2 = new Employee2(2, "Ravi", "hr");
		
		ArrayList<Employee2> employees = new ArrayList<Employee2>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee2(3,"Saurabh", "Developer"));
		
		//Printing employee list with updated values by setting conditions
		for (Employee2 emp : employees)
		{
			if(emp.getId()>2)
			{
				emp.setDept("Manager");
			}
			System.out.println(emp.getId()+" "+ emp.getName()+" "+ emp.getDept());
		}
		
		

	}

}
