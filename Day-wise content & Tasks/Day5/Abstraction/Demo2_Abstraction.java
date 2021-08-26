package techment.Day5.Abstraction;

abstract class Shape
{  
	//unimplemented method draw()-by making abstract we can implement it in its child class
	abstract void draw();  
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

class Circle extends Shape
{  
	void draw()
	{
		System.out.println("Drawing circle...");
	}  
}  

public class Demo2_Abstraction {

	public static void main(String[] args) {
		
		Shape shape1 = new Circle(); //upcasting
		shape1.draw();  

		Shape shape2 = new Rectangle();
		shape2.draw();

	}

}
