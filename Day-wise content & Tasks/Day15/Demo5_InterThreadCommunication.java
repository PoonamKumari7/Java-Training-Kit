package techment.Day15.MultiThreading;

/** Program : Making thread Synchronized in order to communicate with each other, which can be achieved by wait() & notify() */

class Account
{
	int balance = 0;

	synchronized public int withdraw(int amount) 
	{
		if(amount>balance)
		{
			try
			{
				System.out.println("No balance! waiting for deposit...");
				wait();  //sends the upcoming threads into waiting state 
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " is going to withdraw");
		balance -= amount; // balance = balance - amount
		return balance;
	}

	synchronized public int deposit(int amount) 
	{

		System.out.println(Thread.currentThread().getName() + " is going to deposit");
		balance += amount;
		notify();  //necessary to notify after wait for the further execution of another threads
		
		return balance;	
	}
}


public class Demo5_InterThreadCommunication {

	public static void main(String[] args) {

		Account account = new Account();

		Thread t1 = new Thread()
		{
			public void run() {
				System.out.println("After withdraw, balance is : " +account.withdraw(2000));

			}
		};
		
		Thread t2 = new Thread()
		{
			public void run() {
				System.out.println("After deposit, balance is : " +account.deposit(3000));

			}
		};
		
		t1.setName("ATM");
		t2.setName("Bank");
		
		t1.start();
		t2.start();

	}

}
