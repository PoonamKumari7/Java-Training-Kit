package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Task_JPA_Criteria_Select {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  
		
		em.getTransaction().begin( );  

		CriteriaBuilder cb=em.getCriteriaBuilder();  
		CriteriaQuery<Product> cq=cb.createQuery(Product.class);  

		Root<Product> stud=cq.from(Product.class);  

		cq.select(stud.get("name"));   

		CriteriaQuery<Product> select = cq.select(stud);  
		TypedQuery<Product> q = em.createQuery(select);  
		List<Product> list = q.getResultList();  

		System.out.println("id");  


		for(Product s:list)  
		{  
			System.out.println(s.getId());  

		}  

		em.getTransaction().commit();  
		em.close();  
		emf.close();    
	}  
}  
