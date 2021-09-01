package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author POONAM
 * Insertion of records in database using JPA EnitityManager
 *
 */

public class JPA_InsertingEntity {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		
		EntityManager em =  emf.createEntityManager();
		
		//inserting records
		em.getTransaction().begin();
		
		//change data each time before run App
		Product product1 = new Product();
		product1.setId(5);
		product1.setName("Dell");
		product1.setPrice(277000);
		product1.setCategory("Computer");
		
		em.persist(product1);
		
		System.out.println("===============HQL generated================");
		
		em.getTransaction().commit();
		System.out.println("=============Records inserted to DB==========");
		
	
		em.getTransaction().commit();
		
		em.close();
		emf.close();  
		
	}
}

