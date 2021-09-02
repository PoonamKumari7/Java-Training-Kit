package techment.Day15.MultiThreading;

/** Output : Randomly & simultaneously threads will run before synchronization */

/** Description : The main aim of multi-threading is to execute as many tasks in parallel as is possible.
 *  However, synchronization throttles the parallelism for threads which have to execute synchronized method or block.
 * 
 * @author POONAM
 *
 */
class Water
{

	synchronized public void drinkWater(int time)  //it will whole objects will get lock until thread is running 
	{

		for(int i=1; i<=time; i++)
		{
			System.out.println(Thread.currentThread().getName() + " is drinking water " +i +" times");
		}

		for(int i=1; i<=time; i++)
		{
			System.out.println(Thread.currentThread().getName() + " is eating " +i +" times");
		}
	}
}

//	public void drinkWater(int time)  
//	{
//	/**	synchronized (this) {	//it will restrict the block inside the method if we don't want other block to be blocked */
//
//			for(int i=1; i<=time; i++)
//			{
//				System.out.println(Thread.currentThread().getName() + " is drinking water " +i +" times");
//			}
//
//	//	}
//	}
//}

class WaterBottle implements Runnable      //(or) class WaterBottle extends Thread
{
	Water1 water = new Water1();

	@Override
	public void run() {
		water.drinkWater(5);

	}

}
public class Demo3_Synchronization1 {

	public static void main(String[] args) {


		WaterBottle1 waterBottle = new WaterBottle1();

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
