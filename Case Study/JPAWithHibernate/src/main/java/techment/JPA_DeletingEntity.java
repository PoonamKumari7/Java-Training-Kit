package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author POONAM
 * Deletion of records in database using JPA EnitityManager
 *
 */

public class JPA_DeletingEntity {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();

		//Deleting data
		em.getTransaction().begin();
		
		Author author = em.find(Author.class, 7);
		
		System.out.println("\n============Before Deletion============");
		System.out.println(author.getAuthorId());
		System.out.println(author.getFirstName());
		System.out.println(author.getMiddleName());
		System.out.println(author.getLastName());
		
		
		em.remove(author);
		
		System.out.println("\n============After Deletion============");
	
		System.out.println("\n============HQL generated============");
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
	}
}
