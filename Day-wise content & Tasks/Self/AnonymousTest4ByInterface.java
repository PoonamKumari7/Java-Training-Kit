package techment.self;

interface Example1
{
	void callThis();
}
public class AnonymousTest4ByInterface {

	public static void main(String[] args) {
		
		Example example_obj = new Example() {
			
			@Override
			void callThis() {
				System.out.println("2nd way to create anonymous class by implementing Interface!");
				
			}
		};
		example_obj.callThis();
	}

}
