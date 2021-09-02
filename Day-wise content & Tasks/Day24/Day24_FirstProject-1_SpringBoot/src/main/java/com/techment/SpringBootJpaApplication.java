package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
	
	@Autowired
	IProductDao iProductDao;
	
	public static void main(String[] args)  {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("Hello World this is just for testing Application");
		
		System.out.println("=======================Queries=======================");
		Product product1 = new Product("dell", "Laptop", 55000);
		Product product2 = new Product("Mi", "Phone", 15000);
		
//		iProductDao.save(product1);
//		iProductDao.save(product2);
		
		/**
		 * findAll
		 */
		
		List<Product> products = iProductDao.findAll();
		products.forEach(System.out::println);
		
//		System.out.println("==================records inserted====================");
//		
//		for(Product p :products)
//		{
//			System.out.println();
//			System.out.println(p);
//			System.out.println();
//		}
		
		/**
		 * findByID
		 */
		System.out.println("=================1st Method findByID==========================");
		Optional<Product> product = iProductDao.findById(30);
		if(product.isPresent())
			System.out.println("Products" +product.get());
		else
			System.out.println("No value with the given id");
		
		System.out.println("=================2nd Method findByID==========================");
		Product product3 = iProductDao.findById(3).get();
		System.out.println("Products : "+product);
		
		/**
		 * count
		 */
		long totalProducts = iProductDao.count();
		System.out.println("Total number of Products : "+totalProducts);
		
		/**
		 * delete
		 */
		iProductDao.deleteById(3);
		System.out.println("===============Deleted=======================");
		
		
//		/**
//		 * exists?
//		 */
//		try
//		{
//			iProductDao.existsById(3);
//		}
//		catch(Exception e) {
//			System.out.println("No id present");
//		}
		
		List<Product> prod1 = iProductDao.findByName("Mi");
		System.out.println("Product by Name : "+prod1);
		
		List<Product> prod2 = iProductDao.findByCategory("Laptop");
		System.out.println("Product by Category : "+prod2);
		
		
		
		
		
		
		
		
	}
}
























