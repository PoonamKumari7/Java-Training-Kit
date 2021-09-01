package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * 
 * @author POONAM
 * JPQL - JPA Java persistence Query language Basic operations
 *
 */

public class JPQL_BasicOperations {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		
		EntityManager em =  emf.createEntityManager();
		
		//------------------------------------------------------------
		Query query1 = em.createQuery("select p from Product p");
		
		List<Product> products = query1.getResultList();
		
		for(Product p : products)
		{
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		
		//------------------------------------------------------------
		Query query2 = em.createQuery("select p.id from Product p");
		List<Integer> ids = query2.getResultList();
		
		for(Integer i : ids)
		{
			System.out.println(ids);
		}
		
		System.out.println("================================");
		Query query3 = em.createQuery("findAll");
		List<Product> products2 = query3.getResultList();
		
		for(Product q : products2)
		{
			System.out.println(q.getId()+" "+q.getName()+" "+q.getCategory());  
		}
		
	}
}

