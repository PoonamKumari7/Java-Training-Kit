package techment.Day4.toString;

/** Program to understand Object class method - toString()
 * 
 * @author POONAM
 * 
 *  1. Object class is a Super class for all the java class.
 *  2. Object class methods - toString, hashCode, equals, wait
 *
 */

public class Demo1_ToString {

	public static void main(String[] args) {
		
		//1-way to pass values to the class methods 
		Product product = new Product(); //default constructor
		product.id = 100;
		product.name = "Laptop";
		product.price = 67000;
		
		System.out.println(product.toString());
		
		//2-way to pass values to toString() through constructor 
		Product product1 = new Product(200, "Watch", 3000);
		Product product2 = new Product(200, "Watch", 3000);
		
		System.out.println(product1);
		System.out.println(product2.toString());
		
	}

}
