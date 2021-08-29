package techment.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import techment.modal.Employee;
import techment.utility.CollectionUtil;

public class EmployeeDaoImplementation implements IEmployeeDao {

	//created obj of collection util class
	CollectionUtil collectionUtil = new CollectionUtil();
	
	@Override
	public Employee getEmployeeById(int id) {
		
		//returning list of employee by id from collection
		Map<Integer, Employee> emMap = collectionUtil.getEmployeeList();
		Employee employee = emMap.get(1);
		return employee;
	}

	@Override
	public List<Employee> getEmployeesByDept(String dept) {
		
		//List is declared to store all the employee based on dept
		List<Employee> employeeList = new ArrayList<Employee>();
		
		//it returns the map data which contains employee details
		Map<Integer, Employee> emMap = collectionUtil.getEmployeeList();
		
		for(Employee employee : emMap.values())
		{
			//equalsIgnoreCase(dept) : compares employee list to dept
			if(employee.getDept().equalsIgnoreCase(dept))
			{
				employeeList.add(employee);
			}
		}
		
		return employeeList;
	}

}
