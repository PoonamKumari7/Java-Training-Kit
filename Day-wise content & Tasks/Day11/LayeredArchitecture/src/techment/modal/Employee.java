package techment.modal;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private double salary;

	/**
	 * while using constructor add default constructor also.
	 * 
	 * for generating default constructor 2-ways
	 *  1. right click -> source -> generate constructor from superclass
	 *  2. right click -> source -> generate constructor using fields-> deselct all
	 *  
	 */
	public Employee() {
		super();
	}

	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;

	}

	//getter setter
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//toSting
	@Override
	public String toString() {
		return "Empoyee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}


}
