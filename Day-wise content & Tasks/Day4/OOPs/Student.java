package techment.Day4.OOPs;

public class Student extends Person {
	
	String dept;
	String collegeName;
	
	void displayStudentDetails()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Department : "+dept);
		System.out.println("College Name : "+collegeName);		
		
	}

}
