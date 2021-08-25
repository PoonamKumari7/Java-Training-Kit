package techment.CodingTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class WWE
{
	private String firstName;
	private String lastName;
	private int weight;

	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "[firstName = " + firstName + ", lastName = " + lastName + ", weight = " + weight + "]";
	}		
}


public class Question3_WWEWrestlerImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<WWE> wrestlerlist = new ArrayList<WWE>();

		wrestlerlist.add(new WWE("Great", "Khali", 847));
		wrestlerlist.add(new WWE("Jackson", "Andrews", 140));
		wrestlerlist.add(new WWE("Big", "show", 485));
		wrestlerlist.add(new WWE("Paul", "Bunyan", 130));
		wrestlerlist.add(new WWE("Giant", "Silva", 385));
		wrestlerlist.add(new WWE("Big", "cass", 276));
		wrestlerlist.add(new WWE("Loch", "Ness", 90));
		wrestlerlist.add(new WWE("Matt", "Morgan", 128));
		wrestlerlist.add(new WWE("Nathan", "Jones", 135));
		wrestlerlist.add(new WWE("Undertaker", "", 309));

		System.out.println("=================List of Wrestlers=====================================\n");
		wrestlerlist.stream().forEach(w->System.out.println(w));

		/**********************to count number of wrestler********************************************/

		Long wrestlercount = wrestlerlist.stream().count();
		System.out.println("\n=====================================================================\n");
		System.out.println("Total number of Wrestlers are : " +wrestlercount);


		/*******sum of all weight of all wrestlers whose weight is above 200*******/

		//List<WWE> emp=wrestlerlist.stream().filter(e->e.getWeight()>200).collect(Collectors.toList());
		Long total_weight = wrestlerlist.stream().filter( e-> e.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		System.out.println("\n=====================================================================\n");
		System.out.println("Sum of weight of all wrestlers whose weight is above 200 is : " +total_weight);
		System.out.println("\n=====================================================================\n");

		Question3_WWEWrestlerImplementation.minWeight(wrestlerlist);
		Question3_WWEWrestlerImplementation.printFirstName(wrestlerlist);

		//wrestlerlist.stream().forEach(e-> System.out.println("First name : " +e.getFirstName()));

		//       
		//       int min_weight = wrestlerlist.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		//       System.out.println("\n=====================================================================\n");
		//       System.out.println("Minimum weight among all Wrestlers is : " +min_weight);
		//       System.out.println("\n=====================================================================\n");
	}

	static void printFirstName(List<WWE> listwwename)
	{
		System.out.println("\n=====================================================================\n");
		System.out.println("Only first name of Wrestlers are : \n");
		listwwename.stream().forEach(f->System.out.println(f.getFirstName()));
		//	 System.out.println(listwwename.stream().collect(Collectors.toList()));
		System.out.println("\n=====================================================================\n");
	}

	static void minWeight(List<WWE> listwweminweight)
	{
		int min_weight = listwweminweight.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		System.out.println("Minimum weight among all Wrestlers is : " +min_weight);

	}

}









































