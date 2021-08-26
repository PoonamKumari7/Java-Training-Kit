package techment.Day4.SuperConstructor;

/**
 * 
 * @author POONAM
 * super is used to refer Parent class property
 */

class Child extends Parent {

	Child(int x)
	{
		super(2);  //2 sent to Parent class
		System.out.println("This is the child constructor "+x); // x will get the value from main
	}
}
