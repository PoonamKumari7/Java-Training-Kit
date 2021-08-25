package techment.Day3;

/**
 * 
 * @author POONAM
 * output - 1
 * 			23
 * 			456
 * 
 */ 

public class Task8_Pattern4 {

	public static void main(String[] args) {

		int row = 3;
		int value = 1;

		for (int i = 1; i <= row; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(value); 
				value++;
			}
			System.out.println();
		}
	}

}
