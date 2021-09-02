package techment.self;

/** Without Dog class */

interface Animal1
{
	void bark();
}

public class AnonymousTest2 {

	public static void main(String[] args) {
		
		Animal1 animal_obj = new Animal1() {
			
			@Override
			public void bark() {
				System.out.println("Dog Barks!");
				
			}
		};

		animal_obj.bark();
	}

}

