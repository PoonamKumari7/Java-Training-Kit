package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author POONAM
 * Finding records in database using JPA EnitityManager
 *
 */
public class JPA_FindingEntity {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();

		//Finding records
		em.getTransaction().begin();

		Product product = em.find(Product.class, 7);

		System.out.println("\n============Records found in DB==========");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());

		em.persist(product);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}
}