package techment.Day3;

/**
 * 
 * @author POONAM
 * output - ***** 
 *	*
 *	*
 *	*
 *****
 */ 			

public class Task7_Pattern3 {

	public static void main(String[] args) {

		int row = 5;
		//Outer Loop for number of Rows
		for(int i=0;i<row;i++)
		{
			// Inner loop for printing '*' in each column.
			for(int j=0;j<row;j++)
			{
				// For first row and last row print '*' and for every other row print the '*' at boundary. 
				if(i==0 || i==row-1 || j==0 || j==row-1)
				{
					System.out.print("*");
				}
				// Otherwise print blank space.
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
