package techment.self;

interface Customer 
{
	void deposit();
}
//class CustomerClass implements Customer
//{
//
//	@Override
//	public void deposit(int a) {
//		System.out.println("I am inside deposite method ");
//		
//	}
//	
//}

public class AnonymousTest {

	public static void main(String[] args) {
		
		Customer obj = new Customer() {
			
			@Override
			public void deposit() {
				System.out.println();
				
			}
		};
	}

}
