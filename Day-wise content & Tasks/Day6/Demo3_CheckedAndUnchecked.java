package techment.Day6;

import java.io.FileNotFoundException;

public class Demo3_CheckedAndUnchecked {

	public static void main(String[] args) throws FileNotFoundException { 
		
		//throw new ArithmeticException("something went wrong..."); //no need to declare exception
		
		throw new FileNotFoundException("File is not present");  //either declare exception(using throws) or write this inside try catch block

		
	}

}
