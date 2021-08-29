package techment.Day12.NewFeaturesJDK8;

/**
 * 
 * @author POONAM
 * Program structure - Functional interface demonstration
 *
 */

@FunctionalInterface //used to achieve lamda exp
interface Bank //Functional interface
{
	void rateOfInterrest();
	//void loan(); //can't have more than one method inside functional interface
	default void display() //can use override
	{
		System.out.println("This is Default method");
	}
	
	static void loan()
	{
		System.out.println("You can apply for loan");
	}
}

public class Demo2_FunctionalInterface {

	public static void main(String[] args) {

		
		
		}


	}
