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
		Author author = new Author();
		author.setAuthorId(2);
		author.setFirstName("Ashiya");
		author.setMiddleName("");
		author.setLastName("Sharma");
		author.setPhoneNo("1234567890");
		
		em.persist(author);
		
		System.out.println("===============HQL generated================");
		
		em.getTransaction().commit();
		System.out.println("=============Records inserted to DB==========");
		
	
		em.getTransaction().commit();
		
		em.close();
		emf.close();  
		
	}
}