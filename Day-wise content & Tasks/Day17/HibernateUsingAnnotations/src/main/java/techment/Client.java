package techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student();

		student.setStudentId(777);
		student.setDept("CSE");
		student.setName("Poonam");

		session.persist(student);
		System.out.println("Data is inserted to 'student' table...");

		tx.commit();

		session.close();
	}

}
