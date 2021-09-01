package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task_JPQL_Advanced_Aggregate {

	public static void main(String[] args) {
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
          
        Query q1 = em.createQuery("Select count(p) from Product p");
        System.out.print("\n======================================\n");
        System.out.println("\nTotal Number of Products : "+q1.getSingleResult());  
             
        Query q2 = em.createQuery("Select MAX(p.price) from Product p");
        System.out.print("\n======================================\n");
        System.out.println("\nMaximum Price : "+q2.getSingleResult());  
          
        Query q3 = em.createQuery("Select MIN(p.price) from Product p");
        System.out.print("\n======================================\n");
        System.out.println("\nMinimum Price : "+q3.getSingleResult());  

        em.getTransaction().commit();  
        em.close();  
        emf.close();    
   }  
} 
