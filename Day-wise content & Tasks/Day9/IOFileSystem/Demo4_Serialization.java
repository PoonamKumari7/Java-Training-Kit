package techment.Day9.IOFileSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	transient String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class Demo4_Serialization {

	public static void main(String[] args) throws IOException {
	
		EmployeeClass emp1 = new EmployeeClass(1, "Sachin");
		System.out.println("---------------Started----------------------");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("---------------Completed----------------");
	}

}