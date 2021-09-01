package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author POONAM
 * Updation of records in database using JPA EnitityManager
 *
 */

public class JPA_UpdatingEntity {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();

		//updating records
		em.getTransaction().begin();
		
		Product product = em.find(Product.class, 7);
		
		System.out.println("\n============Before Updation============");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		
		product.setName("RK");
		
		System.out.println("\n============After Updation============");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		
		em.persist(product);
		System.out.println("\n============HQL generated============");
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
