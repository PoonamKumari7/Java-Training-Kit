package techment.Day13.NewFeaturesJDK8;

interface A
{
	Student getStudentDetails();
}
class Student
{
	int id;
	String name;
	
	void display()
	{
		System.out.println("Student details is displayed");
	}
}


public class Demo4_ConstructorReference {

	public static void main(String[] args) {
		
		// by using lambda multiline
		A a = () ->{
			
			Student s = new Student();
			return s;
		};
		
		
		//by using lanbda single line
		A a1 = () -> new Student();
		a1.getStudentDetails().display();
		
		
		//by using method reference
		A obj = Student::new;
		obj.getStudentDetails().display();
	}

}
