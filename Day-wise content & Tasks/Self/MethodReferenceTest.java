package techment.self;

/** Static method reference example */

interface Animal3
{
	void bark();
}

public class MethodReferenceTest {
	
	public static void callBark()
	{
		System.out.println("This is static method : Dog barks here!");
	}

	public static void main(String[] args) {

		/** referring static method */
		Animal3 obj_method_reference = MethodReferenceTest::callBark;
		
		/** calling interface method */
		obj_method_reference.bark();
		
	}

}
