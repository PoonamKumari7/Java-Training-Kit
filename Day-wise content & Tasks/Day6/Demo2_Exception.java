package techment.Day6;

public class Demo2_Exception {

	public static void main(String[] args) {

		System.out.println("name is Poonam");
		System.out.println("email is Pk@gmail.com");
		int arr[] = new int[5];
		try
		{
			System.out.println(1/0);   //ArithmeticException
			arr[7] = 24;			   //ArrayIndexOutOfBoundsException
			System.out.println(8/2);
		}
		
		//Rule : Exception's priority wise write catch block
		catch(ArithmeticException e)
		{
			System.out.println("Don't give zero");
		}
		catch(ArrayIndexOutOfBoundsException e) //runtime exception
		{
			System.out.println("Array size is 5 give from 0 to 4 index");
		}
		catch(Exception e) //runtime exception
		{
			System.out.println("something went wrong...");
		}
		System.out.println("contact is 9087654123");

	}

}
