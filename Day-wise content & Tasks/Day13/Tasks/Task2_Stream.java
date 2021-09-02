package techment.Day13.NewFeaturesJDK8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class AgeComparator1 implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else
			return -1;
	}
	
}

	
public class Task2_Stream {

	public static void main(String[] args) {
		
			ArrayList<Employee> employees = new ArrayList<Employee>();
				employees.add(new Employee(1,"Krishna","Hr",20000,18));
				employees.add(new Employee(2,"Aman","Developer",30000,20));
				employees.add(new Employee(3,"Jasmine","Secretary",40000,38));
				employees.add(new Employee(4,"Rahul","Developer",25000,27));
				employees.add(new Employee(5,"Mohit","Hr",15000,30));
				
				employees.forEach(System.out::println);
				
				employees
				
				//List<String> li = employees.stream().map(e->e.getName()+ " "+e.getSalary() +" ");
				
				Task2_Stream task2_Stream = new Task2_Stream();
				
				
				

	}
	
	Long deptWiseDetails(ArrayList<Employee> employees, String dept)
	{
		employees.stream().filter(e->e.getDept())
		//Long sumSal = employee.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList()));
		Long sumSal = employee.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		return sumSal;
	

}

}
