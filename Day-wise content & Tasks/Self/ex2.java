package techment.Self;

/**
 * @author POONAM
 * 1. Getter setter method to initialize data member of the class 
      with the help of instance of class ie object
 * 2. Getter setter method is used to protect data
 * 3. Encapsulation
 */

class Employee
{
	int id;
	String name ;
	String dept ;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}


public class ex2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Poonam Kumaari");
		e1.setDept("Lead");
		
		System.out.println(e1.getId()+e1.getName()+e1.getDept());
		

	}

}
