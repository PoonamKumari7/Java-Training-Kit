package techment.service;

import java.util.List;

import techment.modal.Employee;

public interface IEmployeeService {
	
	Employee getEmployeeById(int id);
	List<Employee> getEmployeesByDept(String dept);

}
