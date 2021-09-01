package techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task_JPQL_BulkData_Delete {

	public static void main(String[] args) {

        
      EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
      EntityManager em = emf.createEntityManager();  
      em.getTransaction().begin( );  
          
      Query query = em.createQuery( "delete from Product where id=3");  
        
      query.executeUpdate();  

      em.getTransaction().commit();  
      em.close();  
      emf.close(); 

	}

}
