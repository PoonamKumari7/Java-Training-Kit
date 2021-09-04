package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA_UpdatingEntity {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();

		//updating records
		em.getTransaction().begin();
		
		Author author = em.find(Author.class, 3);
		
		System.out.println("\n============Before Updation============");
		System.out.println(author.getAuthorId());
		System.out.println(author.getFirstName());
		System.out.println(author.getMiddleName());
		System.out.println(author.getLastName());
		
		
		author.setFirstName("PK");
		
		System.out.println("\n============After Updation============");
		System.out.println(author.getAuthorId());
		System.out.println(author.getFirstName());
		System.out.println(author.getMiddleName());
		System.out.println(author.getLastName());
		
		em.persist(author);
		System.out.println("\n============HQL generated============");
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
