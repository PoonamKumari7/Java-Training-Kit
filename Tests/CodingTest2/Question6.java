package techment.CodingTest2;

import java.util.Scanner;

class NameAgeException extends RuntimeException  // UserDefinedException
{
	String msg;

	public NameAgeException(String msg) {
		super();
		this.msg = msg;
	}	
}

class Person
{
	int id;
	String name ;
	int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Name : ");
		String pname = scanner.nextLine();

		try{
			if(pname.length()<3)						
				throw new NameAgeException("Length less then 3 is not eligible for voting");
			else
				System.out.println("Your name is : " +pname);
				System.out.println("\nNot an Exception because Your name length is more than 3\n");

			System.out.println("Enter the Age : ");
			int page = scanner.nextInt();

			try{
				if(page<15)
					throw new NameAgeException("Age less then 15 is not eligible for voting");
				else
					System.out.println("Your age is more than 15 so You can Vote.");

			}catch(Exception e)
			{			
				System.out.println("Age exception msg : "+e);

			}

		}catch(Exception e)
		{			
			System.out.println("name exception msg : "+e);
		}

	}	

}




