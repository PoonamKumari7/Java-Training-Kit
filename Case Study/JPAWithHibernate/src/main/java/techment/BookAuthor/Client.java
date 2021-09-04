package techment.BookAuthor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import techment.Author;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author Poonam = new Author();
		Poonam.setAuthorId(1);
		Poonam.setFirstName("POONAM");
		Poonam.setMiddleName("Kumari");
		Poonam.setLastName("Prasad");
		Poonam.setPhoneNo("7898679216");
		
		em.persist(Poonam);
		
		Book books = new Book();
		books.setBookNo(1);
		books.setBookTitle("DS");
		books.setBookPrice(250);
		books.setAuthor(author1);
		
		
		
		em.persist(books);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		

	}

}
