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
		
		Product product = em.find(Product.class, 5);
		
		System.out.println("\n============Before Deletion============");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		
		em.remove(product);
		
		System.out.println("\n============After Deletion============");
	
		System.out.println("\n============HQL generated============");
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
	}
}
