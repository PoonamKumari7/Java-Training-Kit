package techment.self;

abstract class Example
{
	abstract void callThis();
}
public class AnonymousTest3ByClass {

	public static void main(String[] args) {

		Example example = new Example() {
			
			@Override
			public void callThis() {
				System.out.println("1st way to create anonymous class by extending Class!");
				
			}
		};
		example.callThis();
	}

}
