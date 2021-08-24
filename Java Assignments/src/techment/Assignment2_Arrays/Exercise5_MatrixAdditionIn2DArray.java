package techment.Assignment2_Arrays;

public class Exercise5_MatrixAdditionIn2DArray {

	public static void main(String[] args) {

		int array1[][]={{11,22,33},{10,50,60},{1,5,4}};    
		int array2[][]={{1,6,8},{22,4,30},{16,25,11}};    

		int result[][]=new int[3][3];  

		//matrix addition
		System.out.println("=============================");
		System.out.println("Matrix addition of two Arrays");
		System.out.println("=============================");
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				result[i][j]=array1[i][j]+array2[i][j];   
				System.out.print("    "+result[i][j]);    
			}    
			System.out.println();  
		}    
	}
}
