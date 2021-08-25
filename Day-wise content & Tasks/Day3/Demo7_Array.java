package techment.Day3;

public class Demo7_Array {

	public static void main(String[] args) {
		
		int marks[]=new int[5];  //Array variable is created with size but not initialized
		marks[2]=67;			// 2nd index of array is initialized
		
		//printing values manually
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		System.out.println("--------");
		
		//printing values using for loop
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}

	}

}
