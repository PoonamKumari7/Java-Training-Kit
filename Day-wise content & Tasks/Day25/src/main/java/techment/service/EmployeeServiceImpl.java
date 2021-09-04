package techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import techment.deo.EmployeeDao;
import techment.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeDao employeeDeo;
	
	
	@Override
	public String addEmployee(Employee employee) {
		
		employeeDeo.save(employee);
		return "employee added";
	}

	@Override
	public List<Employee> viewAllEmployees() {
		
		return employeeDeo.findAll();
	}
	
	
}
