package techment.Day6;

/** 
 * throws is used to declare the exception 
 * outside the method body
 * 
 */

class Student
{
	void checkEligibility(int age) //throws FileNotFoundException
	{
		if(age>=18)
			System.out.println("You can apply for loan");
		else
			throw new ArithmeticException("You can not apply for loan"); //no need to declare exception
		//throw new FileNotFoundException("File is not present");	// need to declare using throws
	}
}
public class Demo4_Throws {

	public static void main(String[] args) {

		Student student = new Student();
		student.checkEligibility(31);

	}

}
