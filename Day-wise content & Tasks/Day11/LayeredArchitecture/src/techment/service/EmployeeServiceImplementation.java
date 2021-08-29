package techment.service;

import java.util.List;

import techment.dao.EmployeeDaoImplementation;
import techment.dao.IEmployeeDao;
import techment.modal.Employee;

public class EmployeeServiceImplementation implements IEmployeeService {
	
	IEmployeeDao employeeDao = new EmployeeDaoImplementation();

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployeesByDept(String dept) {
		return employeeDao.getEmployeesByDept(dept);
	}

}
