package techment.self;

/** Functional interface example */

interface Customer1
{
	void deposit(int amount);
}
public class FunctionalInterfaceTest {
	
	public void deposit(int a) {
		System.out.println("Customer deposit amount is : "+a);	
	}

	public static void main(String[] args) {
		
		FunctionalInterfaceTest functional_interface_obj = new FunctionalInterfaceTest();
		functional_interface_obj.deposit(70000);;

	}

}
