package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task_JPQL_Advanced_Filter {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  

		em.getTransaction().begin( );  

		Query q1 = em.createQuery("Select p from Product p where id between 2 and 5");  
		System.out.println("\n=============HQL for Between Clause================\n");

		@SuppressWarnings("unchecked")
		List<Product> l1 =  (List<Product>)q1.getResultList();  

		System.out.println("\n===============Between Clause=================\n");  
		System.out.print("P_id");  
		System.out.print("\t P_name");  
		System.out.print("\t P_category"); 
		System.out.println("\t P_price");

		for(Product s:l1)  
		{  
			System.out.print(s.getId());  
			System.out.print("\t"+s.getName());  
			System.out.print("\t"+s.getCategory()); 
			System.out.println("\t"+s.getPrice());  
		}  


		Query q2 = em.createQuery("Select p from Product p where id IN(1,4)");  
		System.out.println("\n=============HQL for IN Clause================\n");

		@SuppressWarnings("unchecked")  
		List<Product> l2 =  (List<Product>)q2.getResultList();  

		System.out.println("\n===============IN Clause=================\n"); 
		System.out.print("P_id");  
		System.out.print("\t P_name");  
		System.out.print("\t P_category"); 
		System.out.println("\t P_price");  

		for(Product s:l2)  
		{  
			System.out.print(s.getId());  
			System.out.print("\t"+s.getName()); 
			System.out.print("\t"+s.getCategory());  
			System.out.println("\t"+s.getPrice());  
		}  

		Query q3 = em.createQuery("Select p from Product p where name like '%o%'");  
		System.out.println("\n===============HQL for Like Clause===============\n");

		@SuppressWarnings("unchecked")  
		List<Product> l3 =  (List<Product>)q3.getResultList();  

		System.out.println("\n===============Like Clause=================\n"); 
		System.out.print("P_id");  
		System.out.print("\t P_name");  
		System.out.print("\t P_category"); 
		System.out.println("\t P_price");  


		for(Product s:l3)  
		{  
			System.out.print(s.getId());  
			System.out.print("\t"+s.getName()); 
			System.out.print("\t"+s.getCategory());  
			System.out.println("\t"+s.getPrice());  
		}  

		em.getTransaction().commit();  
		em.close();  
		emf.close();    

	}

}
