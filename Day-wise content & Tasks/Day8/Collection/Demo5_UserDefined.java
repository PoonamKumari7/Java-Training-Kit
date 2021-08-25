package techment.Day8.Collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age;
	
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}	
}

public class Demo5_UserDefined {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Ramesh", "HR", 34));
		employees.add(new Employee(2,"Sachin", "HR", 40));
		employees.add(new Employee(3,"Anil", "HR", 26));
		employees.add(new Employee(4,"Mahesh", "HR", 21));
		employees.add(new Employee(5,"Manoj", "HR", 30));
		
		Collections.sort(employees);
		
		for(Employee emp : employees)
		{
			System.out.println(emp.age);
		}


	}

}
