package techment.CodingPracticeTest;

abstract class Animal
{
	abstract void Shout();
}

class Horse extends Animal
{

	@Override
	void Shout() {
		System.out.println("Horse sound is 'neigh'");
	}	
}

class Cat extends Animal
{
	@Override
	void Shout() {
		System.out.println("Cat sound is 'Meow'");
		
	}	
}

class Dog extends Animal
{

	@Override
	void Shout() {
		System.out.println("Dog sound is 'Bark'");
		
	}
	
}

public class Question4_Polymorphism {

	public static void main(String[] args) {
		
		Horse horse = new Horse();
		horse.Shout();
		Cat cat = new Cat();
		cat.Shout();
		Dog dog = new Dog();
		dog.Shout();
		
	}
}
