package techment.self;

import java.util.Scanner;

public class Exercise51 {

	/** Concatenates the given number with its multiples of 2 and 3.
		Then it checks whether the resulting number contains 1 to 9
		exactly once. There could be any number of zeros and they are
		ignored.. */
	
	public static void main(String[] args) {
		
		int number, n2, n3;      
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter any Number: ");  
		number = sc.nextInt();  
		n2 = number * 2;  
		n3 = number * 3;  
		String concat_string = number + "" + n2 + n3;  
		boolean found = true;  
		for(char c = '1'; c <= '9'; c++)  
		{  
		int count = 0;  
		for(int i = 0; i < concat_string.length(); i++)  
		{  
		char ch = concat_string.charAt(i);  
		if(ch == c)  
		count++;  
		}  
		if(count > 1 || count == 0)  
		{  
		found = false;  
		break;  
		}  
		}  
		if(found)  
		System.out.println(number + " is a fascinating number.");  
		else  
		System.out.println(number + " is not a fascinating number.");  
				
	}

}
