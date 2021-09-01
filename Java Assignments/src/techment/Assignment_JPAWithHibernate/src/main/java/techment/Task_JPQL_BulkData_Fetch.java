package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Task_JPQL_BulkData_Fetch {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  

		em.getTransaction().begin( );  
		System.out.println("\n===============HQL generated==============\n");

		javax.persistence.Query query = em.createQuery("select p from Product p");


		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList( );   

		System.out.println("\n=========Product Details=============\n");
		System.out.print("P_id");  
		System.out.print("\t P_name");
		System.out.print("\t P_category");
		System.out.println("\t P_price");  


		for( Product prod : list )
		{  
			System.out.print(prod.getId());  
			System.out.print("\t" +  prod.getName());
			System.out.print("\t" + prod.getCategory());
			System.out.print("\t" + prod.getPrice());  
			System.out.println();  
		}
		
		em.getTransaction().commit();  
		
		em.close();  
		emf.close();    
	}  
}

