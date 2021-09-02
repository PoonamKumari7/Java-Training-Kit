package techment.self;

interface Animal
{
	void bark();
}

class Dog implements Animal
{

	@Override
	public void bark() {
		System.out.println("Dog Barks!");
		
	}
	
}

public class AnonymousTest1 {

	public static void main(String[] args) {
		
		Dog dogname = new Dog();
		dogname.bark();
		

	}

}
