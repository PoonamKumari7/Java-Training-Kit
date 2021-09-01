package techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Task_JPA_Criteria_OrderBy {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
		EntityManager em = emf.createEntityManager();  

		em.getTransaction().begin( );  

		System.out.println("\n===================HQL generated===============\n");
		CriteriaBuilder cb=em.getCriteriaBuilder();  
		CriteriaQuery<Product> cq=cb.createQuery(Product.class);  

		Root<Product> stud=cq.from(Product.class);  


		cq.orderBy(cb.asc(stud.get("price")));  

		CriteriaQuery<Product> select = cq.select(stud);  
		TypedQuery<Product> q = em.createQuery(select);  
		List<Product> list = q.getResultList();  

		System.out.println("\n=========Product price in Ascending order========\n");
		System.out.print("P_id");  
		System.out.print("\t P_name");  
		System.out.print("\t P_category");
		System.out.println("\t P_price");

		for(Product s:list)  
		{  
			System.out.print(s.getId());  
			System.out.print("\t"+s.getName());  
			System.out.print("\t"+s.getCategory());
			System.out.println("\t"+s.getPrice());
		}   

		em.getTransaction().commit();  

		em.close();  
		emf.close();    

	}

}
