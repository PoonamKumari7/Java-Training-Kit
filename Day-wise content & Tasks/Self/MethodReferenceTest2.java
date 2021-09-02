package techment.self;

/** Instance method reference example */

interface Animal4
{
	void bark();
}
public class MethodReferenceTest2 {
	
	public void callBark() {
		System.out.println("This is non static method : Dog Barks here!");
		
	}

	public static void main(String[] args) {
		
		//creating obj 
		MethodReferenceTest2 method_reference_obj = new MethodReferenceTest2(); 
		
		//1-referring non static method using reference
		Animal4 animal_obj = method_reference_obj::callBark ;
		
		//calling interface method
		animal_obj.bark();
		
		//2-referring non static method using anonymous object
		Animal4 animal_obj1 = new MethodReferenceTest2()::callBark;
		animal_obj1.bark();

	}

}
