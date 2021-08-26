package techment.Day4.toString;

public class Product {

	int id;
	String name;
	int price;

	/**
	 * right click -> source -> generate toString
	 */

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	/**
	 * parameterized constructor
	 * right click -> source -> constructor using fields
	 */

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//default constructor
	public Product()
	{
		
	}

}
