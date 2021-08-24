package techment.Assignment3_OOPs;

import java.util.Random;
import java.util.Scanner;

abstract class Medicine 
{

	int price;
	int expDate;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getExpDate() {
		return expDate;
	}

	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}

	public void GetDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price :");
		int price =sc.nextInt();
		System.out.println("Enter expiry date :");
		int expDate= sc.nextInt();

		System.out.println("price :"+price);
		System.out.println("Expiry date :"+expDate);

	}

	abstract void displayLabel();
}

class Tablet extends  Medicine
{
	int quantity=30;
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("tablet Quantity :"+quantity);
		System.out.println("tablet price :"+price);
		System.out.println("tablet Expiry date :"+expDate);
		System.out.println("\n Additional information of medicine : Store in a cool dry place");

	}
}

class Syrup extends Medicine
{
	int quantity =55;
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Syrup Quantity :"+quantity);
		System.out.println("Syrup price :"+price);
		System.out.println("Syrup Expiry date :"+expDate);
		System.out.println("\n Additional information of medicine : take it as per doctor discription and"
				+ " store it in cold and dry place");

	}
}

class Ointment extends Medicine
{
	int quantity=15;

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Ointment Quantity :"+quantity);
		System.out.println("Ointment price :"+price);
		System.out.println("Ointment Expiry date :"+expDate);
		System.out.println("\n Additional information of medicine : it is for external use only");

	}
}

public class Exercise5_InheritanceAndAbstraction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Medicine arrayMedicine[] = new Medicine [5];
		
		Medicine tablet = new Tablet();
		Medicine syrup = new Syrup();
		Medicine oinment = new Ointment();

		Random random = new Random();
		if(random.nextInt(3)==3)
		{
			arrayMedicine[3]= new Ointment();
			oinment.setPrice(1200);
			oinment.setExpDate(2022);
			oinment.GetDetails();
			oinment.displayLabel();
			System.out.println(oinment.getExpDate());
			System.out.println(oinment.getPrice());


		}
		else if(random.nextInt(2)==2) {
			arrayMedicine[2]= new Syrup();
			syrup.setPrice(500);
			syrup.setExpDate(2024);
			syrup.GetDetails();
			syrup.displayLabel();
			System.out.println(syrup.getExpDate());
			System.out.println(syrup.getPrice());
		}
		else if(random.nextInt(1)==1)
		{
			arrayMedicine[1]= new Tablet();
			tablet.setPrice(2500);
			tablet.setExpDate(2025);
			tablet.GetDetails();
			tablet.displayLabel();
			System.out.println(tablet.getExpDate());
			System.out.println(tablet.getPrice());
		}


	}

}
