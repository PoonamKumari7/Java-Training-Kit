package techment.Day9.IOFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class EmployeeClass
{
	int id;
	String name;

	public EmployeeClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}

public class Demo5_DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("2abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e = (Employee) ois.readObject();
		System.out.println(e.id);
		System.out.println(e.name);		
	}

}
