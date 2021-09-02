package techment.Day15.MultiThreading;

/** Output : Threads execution after synchronization */

class Water1
{
	/** Description : Synchronized method is used to lock an object for any shared resource. 
	 *  When a thread invokes a synchronized method, it automatically acquires the lock for that
	 *  object and releases it when the thread completes its task.
	 * 
	 * @param time
	 */
	
//	synchronized public void drinkWater(int time)  //whole objects will get lock until thread is running 
//	{
//		for(int i=1; i<=time; i++)
//		{
//			System.out.println(Thread.currentThread().getName() + " is drinking water " +i +" times");
//		}
//
//		for(int i=1; i<=time; i++)
//		{
//			System.out.println(Thread.currentThread().getName() + " is eating " +i +" times");
//		}
//	}
//}

	/** Description : synchronized block encloses only that portion of code instead of the whole method.
	 * 
	 * @param time
	 */
  public void drinkWater(int time)  
	{
	  synchronized (this) {	//it will restrict this for loop block inside the method if we don't want other block to be blocked 

			for(int i=1; i<=time; i++)
			{
				System.out.println(Thread.currentThread().getName() + " is drinking water " +i +" times");
			}
	  }
	  for(int i=1; i<=time; i++)
		{
			System.out.println(Thread.currentThread().getName() + " is eating " +i +" times");
		}
  }
}

class WaterBottle1 implements Runnable      //(or) class WaterBottle extends Thread
{
	Water water = new Water();

	@Override
	public void run() {
		water.drinkWater(5);

	}

}
public class Demo4_Synchronization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterBottle waterBottle = new WaterBottle();

		Thread person1 = new Thread(waterBottle);
		Thread person2 = new Thread(waterBottle);
		Thread person3 = new Thread(waterBottle);

		person1.setName("Amit");
		person2.setName("Parul");
		person3.setName("Sanika");

		person1.start();
		person2.start();
		person3.start();
	}

}
