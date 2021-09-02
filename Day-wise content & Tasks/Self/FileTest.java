package techment.practice;

import java.util.*;
import java.io.*;

public class Prog5 {
	
	public static void main(String[] args) {
		
	

	Scanner inFile = null; {

	try{

		inFile = new Scanner(new File("Passanger.txt"));
	}

	catch(FileNotFoundException e){
		System.err.println("File not found");
		System.exit(1);
	}

	while(inFile.hasNext()){

		String Fname = inFile.next();
		String Lname = inFile.next();
		String rank = inFile.next();
		double salary = inFile.nextDouble();

		System.out.printf("%-10s %3d %6.2f\n", Lname, Fname, rank, salary);
	}
	inFile.close();
}
}
}


