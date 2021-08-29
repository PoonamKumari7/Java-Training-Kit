package techment.client;

import java.util.List;
import java.util.Scanner;

import techment.modal.Employee;
import techment.service.EmployeeServiceImplementation;
import techment.service.IEmployeeService;

public class EmployeeApplication {

	public static void main(String[] args) {

		IEmployeeService service = new EmployeeServiceImplementation();

		System.out.println("==============Employee Application===============");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter the id to fetch employee : ");
		int id = scanner.nextInt();

		Employee employee = service.getEmployeeById(id);
		System.out.println("\n"+employee);
		
		System.out.print("\nEnter the department to fetch employee : ");
		String dept = scanner.next();
		List<Employee> employees = service.getEmployeesByDept(dept);
		System.out.println("\n"+employees);

	}

}
