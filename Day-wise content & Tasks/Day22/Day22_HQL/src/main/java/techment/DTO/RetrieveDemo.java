package techment.DTO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

//class cast exception
public class RetrieveDemo {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query<StudentDto> query1 = session.createQuery("select s.studentId, s.studentName from Student s");
		List<StudentDto> sd = query1.list();
		
		System.out.println(sd.size());
		System.out.println(sd.get(1).getStudentId());
		
//		Iterator iterator = sd.iterator();
//		while(iterator.hasNext())
//		{
//			Object o[] = (Object[])iterator.next();
//			System.out.println("----------------");
//			System.out.println(o[0]+ " "+o[1]);
//			System.out.println("----------------");
//		}

	}

}
