package techment.self;

/** Method Reference to constructor example */

interface Animal5
{
	AnimalClass getArgument(String arg);
}

class AnimalClass   //constructor class
{
	AnimalClass(String arg)
	{
		System.out.println(arg);
	}
}

public class MethodReferenceTest3 {

	public static void main(String[] args) {

		Animal5 animal_obj = AnimalClass::new;
		animal_obj.getArgument("Dog barks!");

	}

}
