package techment.CodingPracticeTest;

import javax.naming.LinkException;

class Employee1
{
	private String FirstName;
	private String LastName;
	
	public Employee1(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
	validate( firstName, lastName);
}

public void validate(String First, String Last)
		{
		try
			{
			if(First==null || Last==null)
				System.out.println();
					
			if(First.length()<4 || Last.length()<4)
				throw new LinkException();
			else
				System.out.println("First Name is : " + First + " & Last Name is : "+ Last);
			}
		
		catch(NullPointerException ex)
		{
			System.out.println("Entry Missing .");
		}
			
		catch(LinkException ex)
		{
			System.out.println();
			System.out.println("Name should have minimum 3 characters");
		}
		}
		
		@Override
		public String toString() {
			return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
			}	
		}

public class Question3_Exception {
	
	public static void main(String[] args) {
		
		Employee1 emp = new Employee1("P","K");
		//Employee1 emp = new Employee1("Poonam","Kumari");
				
					
	}
}

