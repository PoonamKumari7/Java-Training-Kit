/**
 * @author POONAM
 * 
 * if we use database for taking data then there is no need of this Utility package
 * it is made just to take static data from collection
 * 
 * 1 method - getEmployeeList() return the list of employees
 * 
 */

package techment.utility;

import java.util.HashMap;
import java.util.Map;

import techment.modal.Employee;

public class CollectionUtil {
	
	static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	static
	{
		employees.put(1, new Employee(1, "Poonam", "Java Developer", 57000));
		employees.put(2, new Employee(2, "John", "Manager", 43000));
		employees.put(3, new Employee(3, "Ritz", "HR", 60000));
		employees.put(4, new Employee(4, "Ronit", "Developer", 55000));
		employees.put(5, new Employee(5, "Om", "CEO", 100000));
	}
	
	/**
	 * Description : this method is used to get the employee map, which we initialized as static data
	 * @return employee map list
	 */
	
	public static Map<Integer, Employee> getEmployeeList()
	{
		return employees;
	}

}
