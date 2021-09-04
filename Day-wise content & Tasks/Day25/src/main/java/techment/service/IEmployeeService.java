package techment.service;

import java.util.List;

import techment.entity.Employee;

public interface IEmployeeService  {
	
	String addEmployee (Employee employee);
	
	List<Employee> viewAllEmployees();
	
	
}
