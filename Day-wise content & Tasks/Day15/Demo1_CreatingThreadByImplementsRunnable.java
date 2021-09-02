package techment.Day15.MultiThreading;

class Message extends Thread        //1-way
{
	public void run() 
	{
		System.out.println("This is my Task");
	}
}

class Info implements Runnable  //2-way
{
	@Override
	public void run() 
	{
		System.out.println("This is my Task");
	}
}


public class Demo1_CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {  //main method is parent Thread
		
		Message message = new Message();	//1-way
		message.start();

		Info info = new Info();				//2-way
		Thread thread = new Thread(info);
		thread.start();
		
	}

}
