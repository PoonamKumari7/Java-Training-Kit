package techment.Day3;

class Car
{
	int model; //global variable
	String color;
	int speed;

	//default constructor
	Car() 
	{
		System.out.println("This is default constructor");
		color = "green";
		model = 2020;
	}

	//parameterized constructor 
	public Car(int model, String color, int speed) { //local variable
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	public String carState(int speed)
	{
		if(speed>=50)
			return "Car is moving fast";
		else if(speed>0 && speed<=49)
			return "Car is moving slow";

		return "Car is stopped";
	}

	public void displayCarDetails()
	{
		System.out.print("Model : "+model);
		System.out.println("   Color : "+color);
	}
}

public class Demo6_OOPs_CarApplication {

	public static void main(String[] args) {

		//Car audi = new Car();
		Car benz = new Car();
		Car audi = new Car(2017, "Yellow", 65);
		System.out.println("Parametrized constructor values : " +audi.speed+", "+audi.color+", "+audi.model);

		//audi.color = "red";
		//benz.model = 2020;

		System.out.println("Audi : "+audi.carState(45));
		System.out.println("Benz : "+benz.carState(0));

		audi.displayCarDetails();
		benz.displayCarDetails();

	}

}

