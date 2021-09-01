package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task_JPQL_BulkData_Update {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  
		em.getTransaction().begin( );  

		Query query = em.createQuery( "update Product SET name='Poonam' where id>4");  
		query.executeUpdate();  

		em.getTransaction().commit();  
		
		em.close();  
		emf.close();    

	}
}
