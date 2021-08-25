package techment.Day8.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	int prod_id;
	String prod_name;
	double prod_price;
	int prod_quantity;
	
	public Product(int prod_id, String prod_name, double prod_price, int prod_quantity) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_quantity = prod_quantity;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", prod_quantity=" + prod_quantity + "]";
	}	
}

class Sort_PriceInAscending implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
		
		if(p1.prod_price==p2.prod_price)
			return 0;
		else if(p1.prod_price>p2.prod_price)
			return 1;
		else
			return -1;
	}	
}
	
class Sort_QuantityInDescending implements Comparator<Product>
{
	@Override
	public int compare(Product p3, Product p4) {
		
		if(p3.prod_quantity==p4.prod_quantity)
			return 0;
		else if(p3.prod_quantity<p4.prod_quantity)
			return 1;
		else 
			return -1;
	}	
}

public class Task4_ProductList {

	public static void main(String[] args) {
		
		ArrayList<Product> prod = new ArrayList<Product>();
		
		prod.add(new Product(1, "Digital watch", 2000, 1));
		prod.add(new Product(2, "Blutooth", 5000, 5));
		prod.add(new Product(3, "Headphones", 450, 2));
		prod.add(new Product(5, "Mic", 248.70, 3));
		prod.add(new Product(4, "Table fan", 799.99, 1));
		prod.add(new Product(6, "Wrist Watch", 2550, 9));
		prod.add(new Product(7, "Data cable", 400, 11));
		prod.add(new Product(8, "Pendrive", 359.55, 4));
		
		System.out.println("\n========================List of all Products==================================\n");
		for(Product prod_obj : prod )
		{
			System.out.println(prod_obj);
		}
		
		System.out.println("\n================Sorting by Product quantity in descending order================\n");
		
		Collections.sort(prod, new Sort_QuantityInDescending());
		
		for(Product product : prod)
		{
			System.out.println(product);
		}
		
		System.out.println("\n================List of Products of price more than 500=========================\n");
		
		for(Product product : prod)
		{
			if(product.prod_price>500)
			{
				System.out.println(product);
			}
		}

		System.out.println("\n================Sorting by Product price in ascending order================\n");
		
		Collections.sort(prod, new Sort_PriceInAscending());
		
		for(Product product : prod)
		{
			System.out.println(product);
		}
	
	}

}
