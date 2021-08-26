package techment.Day5.Interface.Demo3_Interface;

/** Program to understand implementation of multiple interfaces and extending class*/

interface One 
{
	void greet1();
}

interface Two 
{
	void greet2();
}

class Manager
{
	void managerDetails()
	{
		System.out.println("Manager class");
	}
}

//first extend the classes then implement interfaces
class Employee extends Manager implements One,Two
{

	@Override
	public void greet1() {
		
		System.out.println("Implements ONE");
	}

	@Override
	public void greet2() {
		
		System.out.println("Implements TWO");
		
	}
	
}
public class Demo3_Interface {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.greet1();
		employee.greet2();
		employee.managerDetails();
		
		//Manager manager = new Employee();
		//manager.managerDetails();

	}

}
