package techment.Self;



class Employee1
{
	int id;
	String name;
	String dept;
	
	public Employee1(int id, String name, String dept) { //parameterized
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	 Employee1()
	 {
		 id = 23;
		 name = "Ruchika";
		 dept = "Developer";
	 }
	
}

class Student
{
	int stud_id;
	String stud_branch;
	
	Student() // default constructor
	{
		stud_id = 7;
		stud_branch = "CSE";
	}
}

/**
 * @author POONAM
 * 1. Initializing value using Constructor
 * 2. Parameterized Constructor 
 * 3. to call each constructor we need to create separate instance
 */
public class ex1 {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1, "Poonam Kumaari", "Developer");
		System.out.println(e1.id+ " " +e1.name+ " " +e1.dept);
		
		Employee1 e2 = new Employee1();
		System.out.println(e2.id+ " " +e2.name+ " " +e2.dept);
		
		Student s1 = new Student();
		System.out.println(s1.stud_id+" "+s1.stud_branch);
		

	}

}
