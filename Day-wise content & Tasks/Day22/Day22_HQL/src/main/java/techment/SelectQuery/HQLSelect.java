package techment.SelectQuery;

import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author POONAM
 * 
 * Program to 'create Table & fetch the column names from table student500' using 'Select Query' in HQL.
 * HQL - Hibernate query language
 *
 */
public class HQLSelect {
	
	public static void main(String[] args) {
		
		//build configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//open session
		Session session= sessionFactory.openSession();
		
		//create Query object
		Query<Student> query1 = session.createQuery(/*HQL cmd*/"select s from Student s");

		//to get list of hibernate query
		List<Student> studentList1 = query1.list();
		
		System.out.println("\n=======Hibernate Query1 generated=============");
		
		//fetching data from database
		System.out.println();
		studentList1.forEach(System.out::println);
	
		
		System.out.println("\n==============Table data===================");
		studentList1.forEach(s1->System.out.println(s1.getStudentId()+" "+s1.getstudentDept()+" "+s1.getstudentName()));
		
		/********************************************************************************************************************/
		
		System.out.println("\n=========Select only specific column=========");
		
		Query<Student> query2 = session.createQuery("select s.studentDept, s.studentName from Student s");
		List<Student> studentList2 = query2.list();
		System.out.println("\n=======Hibernate Query2 generated=============");
		
		//to print the specific column on console
		//to select partial objects
		Iterator iterator = studentList2.iterator();
		while(iterator.hasNext())
		{
			Object o[] = (Object[])iterator.next();
			System.out.println("----------------");
			System.out.println(o[0]+ " "+o[1]);
			System.out.println("----------------");
		}
		
		//close session
		session.close();
		sessionFactory.close();	
		
	}	
}
