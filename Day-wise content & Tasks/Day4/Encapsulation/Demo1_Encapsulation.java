package techment.Day4.Encapsulation;

/** 
 * Program to understand Encapsulation
 * 
 * @author POONAM
 * Encapsulation
 * 	1. mechanism that binds together code and the data it manipulates.
 * 	2. wrapping data and methods to one unit.
 *	3. Data hiding by making fields private.
 */

public class Demo1_Encapsulation {

	public static void main(String[] args) {

		/**
		 * ----------------------------------------
		 * normal way to set the values via object
		 * ----------------------------------------
		 */
		Employee employee = new Employee();
		
		//employee.id=1001;  //we can assign value of id either here or at the time of declaration inside the class
		//employee.name="Poonam";

		//System.out.println(employee.id);

		/**--------------------------------------------
		 * setting the values through getter, setter
		 * -------------------------------------------
		 */

		employee.setId(7000);
		employee.setName("Poonam Kumari");

		System.out.println("ID : "+employee.getId()+" | Name : "+employee.getName()+" | Class object : "+employee.getClass());

	}

}
