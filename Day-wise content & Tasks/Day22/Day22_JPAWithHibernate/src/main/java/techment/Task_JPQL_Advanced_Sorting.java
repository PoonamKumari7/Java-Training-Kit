package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task_JPQL_Advanced_Sorting {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  
		em.getTransaction().begin( );  

		Query q1 = em.createQuery("Select p from Product p order by p.price desc");
		System.out.println("\n==================HQL generated==================\n");

		@SuppressWarnings("unchecked")  
		List<Product> l1 =  (List<Product>)q1.getResultList();  

		System.out.println("\n========Product price in Descending order=======\n");
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

		System.out.println();

		em.getTransaction().commit();  
		em.close();  
		emf.close();    

	}
}
