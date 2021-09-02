package techment.Day15.MultiThreading;

class Apple extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			//System.out.println("Eat Apple");
			System.out.println("Eat Apple  " +Thread.currentThread().getName());
		}
	}
}

class Banana extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			//System.out.println("Eat Banana");
			System.out.println("Eat Banana " +Thread.currentThread().getName());
		}
	}
}

public class Demo2_ThreadNaming {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		Apple apple = new Apple();
		Banana banana = new Banana();

		/**will set the thread name */
		//apple.setName(" - Apple  Thread");
		//banana.setName(" - Banana Thread");

		//apple.run();
		//banana.run();
		
		/**thread with higher priority will execute first */
		banana.setPriority(8);
		apple.setPriority(1);
		
		apple.start();
		banana.start();
		
		/**will completely suspend the banana thread */
		//banana.suspend();
		
		/**will resume suspended banana thread, necessary to resume the thread after suspending threads */
		//banana.resume();
	}

}
