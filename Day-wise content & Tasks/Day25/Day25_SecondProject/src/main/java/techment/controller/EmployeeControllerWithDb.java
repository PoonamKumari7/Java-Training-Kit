package techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import techment.entity.Employee;
import techment.service.IEmployeeService;

@RestController
@RequestMapping(value = "/empController")
public class EmployeeControllerWithDb {

	@Autowired
	IEmployeeService iEmployeeService;

	@GetMapping(value = "/viewAllEmployee")
	public List<Employee> viewAllEmployee()
	{
		return iEmployeeService.viewAllEmployees();
	}
	
	@PostMapping(value = "/addNewEmployee")
	public String addNewEmployee(@RequestBody Employee employee)
	{
		return iEmployeeService.addEmployee(employee);
	}
}
