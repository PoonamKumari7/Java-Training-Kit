package techment.SelectQuery;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author POONAM
 * 
 * Program to fetch the column names from table student500 with where condition in HQL.
 * HQL - Hibernate query language
 *
 */
public class HQLSelectUsingWhere {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session= sessionFactory.openSession();

		Query query = session.createQuery("select s from Student s where s.studentDept =:x "); //supporting variable x not ?
		query.setParameter("x", "DS");

		List<Student> list = query.getResultList();

		System.out.println("\n======Table Records=======");
		list.forEach(s->System.out.println(s.getStudentId()+" "+s.getstudentName()+" "+s.getstudentDept()));

		session.close();
		sessionFactory.close();	

	}	
}
