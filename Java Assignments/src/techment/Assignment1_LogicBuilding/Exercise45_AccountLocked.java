package techment.Assignment1;

import java.util.Scanner;

/** Program for indicating account locked if user exceeds 3 Invalid attempts */

public class Exercise45_AccountLocked {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pinNumber = 12345;

		
		System.out.print("Enter your ATM PIN : ");
		int enterPin = sc.nextInt();
        int count=0;
		while ( enterPin != pinNumber )
		{
			System.out.println("Incorrect Pin !");
			count++;
			if(count==3)
			{
				System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED!!!");
				break;
			}
			if(count==3)
        	{
        	break;
        	}
			System.out.print("Re-Enter your ATM PIN : ");
			enterPin = sc.nextInt();
		}
          if(count!=3)
          {
      		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
  
          }
		

	}

}
