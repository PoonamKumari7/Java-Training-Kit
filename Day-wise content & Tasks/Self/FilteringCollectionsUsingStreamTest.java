package techment.self;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	int rollno;
	String name;
	String branch;
	
	public Student(int rollno, String name, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}
	
	
}
public class FilteringCollectionsUsingStreamTest {

	public static void main(String[] args) {
		
		List<Student> studentlist_obj = new ArrayList<Student>();
		studentlist_obj.add(new Student(1011, "Poonam Kumari", "CSE"));
		studentlist_obj.add(new Student(1012, "Ruchika sharma", "CSE"));
		studentlist_obj.add(new Student(1013, "Priya chaudhary", "ESE"));
		studentlist_obj.add(new Student(1014, "Anand das", "ME"));
		studentlist_obj.add(new Student(1015, "Sachin", "CE"));
		
	 List<String> branch_list = studentlist_obj.stream()
			 .map(s -> s.name.replace('a', 'T'))
			 .collect(Collectors.toList());
	 
	System.out.println(branch_list);
	}

}
