package techment.Assignment3_OOPs;

import java.util.Scanner;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}	
}

class EngineeringBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class Exercise2_EncapsulationAndInheritance {

	public static void main(String[] args) {
		
		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the title : ");
		String title = scanner.nextLine();
		System.out.print("Enter name of the Author : ");
		String author = scanner.nextLine();
		System.out.print("Enter the Price : ");
		float price = scanner.nextInt();
		
		EngineeringBook enBook = new EngineeringBook();
		enBook.setAuthor(author);
		enBook.setCategory("programming");
		enBook.setPrice(price);
		enBook.setTitle(title);
		System.out.print("\n==============");
		System.out.print("\nBook Details :\n");
		System.out.print("==============");
		System.out.println("\n");
		
		System.out.println("Author Name : "+enBook.getAuthor());
		System.out.println("Book price : "+enBook.getPrice());
		System.out.println("Book Name : "+enBook.getTitle());
		System.out.println("Book Category : "+ enBook.getCategory());
	}

}
