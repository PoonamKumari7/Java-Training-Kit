package techment.Day12.NewFeaturesJDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	String dept;
	int salary;
	int age;

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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int id, String name, String dept, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age + "]";
	}	
}

public class Demo8_EmployeeStream {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, "sachin", "developer", 120000, 38));
		employees.add(new Employee(2, "kumar", "hr", 45000, 28));
		employees.add(new Employee(3, "anil", "hr", 55000, 24));
		employees.add(new Employee(4, "john", "manager", 84000, 32));
		employees.add(new Employee(5, "rahul", "hr", 60000, 27));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		employees.stream().forEach(s->System.out.println(s));

		//to count no of employee
		Long empcount =employees.stream().count();
		System.out.println("\nTotal number of employee are : "+ empcount);

		Long devCount = employees.stream().filter(e->e.getDept().equals("developer")).count();
		System.out.println("\ndeveloper count "+ devCount);

		employees.stream().filter(e->e.getDept().equals("developer")).forEach(e->System.out.println("\nName of developer :"+e.getName()));

		List<Employee> emp=employees.stream().filter(e->e.getDept().equals("developer")).collect(Collectors.toList());
		System.out.println("\n"+emp);
		Long numberOfEmployee =  employees.stream().collect(Collectors.counting());
		System.out.println("\nNo of employee "+numberOfEmployee);
		Demo8_EmployeeStream obj = new Demo8_EmployeeStream();
		List<Employee> empDepts= obj.filterByDept(employees, "developer");
		System.out.println("\n"+empDepts);

		Long totalSalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("\nTotal salary : "+totalSalary);

		int maxSalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
		System.out.println("\nTotal salary : "+maxSalary);

	}

	List filterByDept(ArrayList<Employee> empList, String dept)
	{
		List<Employee> emp =empList.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());

		return emp;
	}
}
