package techment.Assignment1;

import java.util.*;

public class Exercise3_ChoosingTheBestHorse {
	
	public static void main(String[] args) {
		
		/* program to accept the weights of 3 horses and display the weight of the horse with
        maximum weight. If to horses are of same weight and are best then should show message,
        Entered weights are not distinct values. */
		
		Scanner scanner = new Scanner(System.in);

		int horseWeight[] = new int[3];
		
		int min_weight = 3, max_weight = 0;
		for(int i=0, n=1; i<3; i++,n++)
		{
			System.out.print("Enter the "+ n +" Horse weight : ");
			horseWeight[i] = scanner.nextInt();

			if(horseWeight[i] > max_weight)
			{
				max_weight = horseWeight[i];
			}
			if(horseWeight[i]<min_weight)
			{
				min_weight = horseWeight[i];
			}
		}

		System.out.print("\nWeight of 3 Horses are : ");
		for(int i=0; i<horseWeight.length; i++)
		{
			System.out.print(horseWeight[i] + " ");
		}
		
		int i=0;
		if(horseWeight[i]==horseWeight[i+1] || horseWeight[i+1]==horseWeight[i+2] || horseWeight[i+2]==horseWeight[i])
		{
			System.out.print("\n\nEntered weights are not distinct values!");
		}
		
		System.out.print("\n\nMaximum weight of the Horse is : "+max_weight);	
	}
}

