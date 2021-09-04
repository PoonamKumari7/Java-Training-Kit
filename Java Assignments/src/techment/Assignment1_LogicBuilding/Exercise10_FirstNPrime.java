package techment.Assignment1;

import java.util.Scanner;

public class Exercise10_FirstNPrime {
	
	public void isPrime() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n term : ");
		int n = scanner.nextInt();
		
		int store;
		int[] primeSeries = {2,3,5,7,9,11,13,15,17};
		
		//for printing n prime terms of the given series
		System.out.print("Prime numbers in the series upto "+n+"th place are :");
		for(int i=0; i<primeSeries.length; i++)
		{
			store = primeSeries[i];
		}
		
		for(int j=0; j<n; j++)
		{
		
			if(checkPrime(primeSeries[j]))
				System.out.print(" "+primeSeries[j]);
		}
	}
	
	public static boolean checkPrime(int num) 
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2; i<=num/2; i++)
		{
			if((num%i==0))
				return false;
		}
		return true;
	}
		
	public static void main(String[] args) {
		
		//calling isPrime method
		Exercise10_FirstNPrime prime = new Exercise10_FirstNPrime();
		prime.isPrime();
		
		
	
	

	}

}
