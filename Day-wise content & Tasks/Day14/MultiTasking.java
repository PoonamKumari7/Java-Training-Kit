package techment.Day14.MultiThreading;

class Sanika extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Sanika : "+i+ "msg : Welcome to banglore");
		}
	}
}

//class Parul extends Thread
//{
//	public void run()
//	{
//		for(int i=1; i<=5; i++)
//		{
//			System.out.println("Parul : "+i+ "msg : Take vaccination");
//		}
//	}
//}
class Parul extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			if(i>3)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Parul : "+i+ "msg : Take vaccination");
		}
	}
}

class Amit extends Thread
{
	public void run()
	{
		for(int i=1; i<=8; i++)
		{
			System.out.println("Amit : "+i+ "Covid 19 is not over yet");
		}
	}
}
public class MultiTasking {

	public static void main(String[] args) {

		Sanika sanika = new Sanika();
		Parul parul = new Parul();
		Amit amit = new Amit();
		
		/**** normal method to call but wrong as in multithreading concept */
//		sanika.run();
//		parul.run();
//		amit.run();
//		
		
		sanika.start();
		parul.start();
		amit.start();

	}

}
