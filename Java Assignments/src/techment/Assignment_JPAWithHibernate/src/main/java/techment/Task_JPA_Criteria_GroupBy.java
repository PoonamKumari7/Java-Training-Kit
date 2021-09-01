package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Task_JPA_Criteria_GroupBy {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  

		em.getTransaction().begin( );  

		System.out.println("================HQL generated====================");
		CriteriaBuilder cb = em.getCriteriaBuilder();  
		CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);  

		Root<Product> stud = cq.from(Product.class); 

		cq.multiselect(stud.get("category"),cb.count(stud)).groupBy(stud.get("category"));  

		List<Object[]> list = em.createQuery(cq).getResultList(); 
		System.out.println("\n--------------------------");
		System.out.print("category");  
		System.out.println("\t Count");
		System.out.println("--------------------------");
		for(Object[] object : list)
		{  
			System.out.println(object[0] + "     " + object[1]);  

		}  
		em.getTransaction().commit();  
		em.close();  
		emf.close();    

	}
}
