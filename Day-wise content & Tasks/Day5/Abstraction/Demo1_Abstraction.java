package techment.Day5.Abstraction;

// Parent class - Bank
// Child class - AXIS, Kotak

public class Demo1_Abstraction {

	public static void main(String[] args) {

		Bank bank1 = new AXIS();
		System.out.println(bank1.rateOfInterest(5));
	
		System.out.println("------------------------");
		
		Bank bank2 = new Kotak();
		System.out.println(bank2.rateOfInterest(5));
	}

}
