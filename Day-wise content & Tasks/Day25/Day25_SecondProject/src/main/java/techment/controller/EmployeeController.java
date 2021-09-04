package techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import techment.entity.Employee;

@RestController
@RequestMapping(value = "/employeeController")
public class EmployeeController {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeController() {
		employees.add(new Employee(1, "Poonam", "hr"));
		employees.add(new Employee(2, "Ruchi", "developer"));	
		
	}

	@GetMapping(value = "/showMessage")
	public String display()
	{
		return "This is my first demo";
	}
	
	/***************Get method***********************/
	
	@GetMapping(value = "/getAllEmployee")
	public ArrayList<Employee> showEmployees()
	{
		return employees;
	}
	
	/***************Post method***********************/
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping(value = "/addNewEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		//System.out.println(employee.getId() +" "+employee.getName() + " " +employee.getDept()); //no use
		employees.add(employee);
		return "employee added to Database.";
	}
	
}


















