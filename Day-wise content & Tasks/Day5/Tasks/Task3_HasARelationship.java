package techment.Day5.Tasks;

/** Task - 3 Has-A Relationship */

class Car
{
	String name;
	String model;
	Engine engine;

	//Created constructor by clicking right button on here
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}

	void ShowCarDetails()
	{
		System.out.println("Car name : "+name);
		System.out.println("Car model : "+model);
		System.out.println("Car's Engine ID : "+engine.id);
		System.out.println("Car's Engine type : "+engine.type);
	}
}

class Engine
{
	int id;
	String type;

	public Engine(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
}

public class Task3_HasARelationship {

	public static void main(String[] args) {

		Engine engine = new Engine(1234, "4 Stock Engine");

		Car car = new Car("Ford Motor company", "Ford Figo", engine);

		car.ShowCarDetails();
	}
}
