package techment.Assignment1;

import java.util.Scanner;

public class Exercise1_TheGlassHouse {

	public static void main(String[] args) {

		/* Program which accepts a two digit number between 1-18 and find the exit door number of
		the glass house*/
		
		int num,sum;
        
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Enter Glasshouse door number : ");
	    num= scanner.nextInt();
	    
	    if(num<19)
	    {
	    	for(sum=0; num!=0; num/=10 ) 
		    {
		    	sum+=num%10;
		    }
		    
		    System.out.println("Exit door number of the Glasshouse is "+sum); 
	    }
	    
	    else
	    	System.out.println("Glasshouse doesn't consist door number "+num);
	    }
	}


