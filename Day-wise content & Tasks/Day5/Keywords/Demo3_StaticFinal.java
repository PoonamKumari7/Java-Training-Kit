package techment.Day5.Keywords;

class Employee
{
	static String dept; //static keyword updates the values and gives latest value
	final int id=1;
}


public class Demo3_StaticFinal {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		employee1.dept="HR";
		employee2.dept="Developer";

		System.out.println("Employee1 : "+employee1.dept);
		System.out.println("Employee2 : "+employee2.dept);
	}

}
