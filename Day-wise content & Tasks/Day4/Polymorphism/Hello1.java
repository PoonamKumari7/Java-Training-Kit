package techment.Day4.Polymorphism;

public class Hello1 {
	
	public void write(int num)
	{
		System.out.println("You have written number and number is : "+num);
	}
	
	//Method overloading - Methods with same name diff args
	public void write(String msg)
	{
		System.out.println("You have written characters and string is : "+msg);
	}
	
	

}
