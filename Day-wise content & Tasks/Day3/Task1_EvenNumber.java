package techment.Day3;

public class Task1_EvenNumber {

	public static void main(String[] args) {
		
		//Task-1 : Printing Even numbers 1-20 using For loop
		
		System.out.print("Even numbers between 1 to 20 are : ");
		for (int number=0; number<=20; number++)
		{
			if((number%2)==0)
			System.out.print(number+" ");						
		}
	}

}
