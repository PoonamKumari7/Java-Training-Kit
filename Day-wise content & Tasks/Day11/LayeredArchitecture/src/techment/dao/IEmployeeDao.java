/**
 * @author POONAM
 * 
 * DAO : Data access object
 * This package is for 'All the data access logic' 
 * 
 */	
package techment.dao;

import java.util.List;

import techment.modal.Employee;

public interface IEmployeeDao {
	
	Employee getEmployeeById(int id);
	List<Employee> getEmployeesByDept(String dept);
	
}

