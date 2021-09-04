package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author POONAM
 * Finding records from database & showing author details using JPA EnitityManager
 *
 */
public class JPA_FindingEntity {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  

		em.getTransaction().begin( );  
		System.out.println("\n===============HQL generated==============\n");

		javax.persistence.Query query = em.createQuery("select a from Author a where id = 1");


		@SuppressWarnings("unchecked")
		List<Author> list = query.getResultList( );   

		System.out.println("\n=================== Author Details based on given author Id ===============\n");
		System.out.print("id");  
		System.out.print("\t firstName");
		System.out.print("\t middleName");
		System.out.print("\t lastName");
		System.out.println("\t contact");

		for( Author auth : list )
		{  
			System.out.print(auth.getAuthorId());  
			System.out.print("\t" + auth.getFirstName());
			System.out.print("\t\t" + auth.getMiddleName());
			System.out.print("\t\t" + auth.getLastName());
			System.out.print("\t\t" + auth.getPhoneNo());
			System.out.println();  
		}

		em.getTransaction().commit();  

		em.close();  
		emf.close(); 

	}
}