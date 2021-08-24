package techment.Assignment3_OOPs;

interface Polygon 
{
	void calculateArea( );
	void calculatePeri( );
}

class Square implements Polygon
{
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area Of the Square with side " + side + " is : " + (side*side));
	}

	@Override
	public void calculatePeri() {
		System.out.println("PereMeter Of the Square with side " + side + " is : " + (4*side));
	}
	
}

class Rectangle implements Polygon
{
	float Length;
	float breadth;

	public Rectangle(float length, float breadth) {
		super();
		Length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area Of the Square with Length " + Length + " and Breadth " + breadth + "  is : " + (Length*breadth));
	}
	@Override
	public void calculatePeri() {
		System.out.println("Area Of the Square with Length " + Length + " and Breadth " + breadth + "  is : " + (2*(Length+breadth)));
		
	}	
}

public class Exercise6_PolygonInterface {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 25);
		rectangle.calculateArea();
		rectangle.calculatePeri();
		Square square = new Square(18);
		square.calculateArea();
		square.calculatePeri();

	}
}
