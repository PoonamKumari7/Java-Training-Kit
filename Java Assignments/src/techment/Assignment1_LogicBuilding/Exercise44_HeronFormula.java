package techment.Assignment1;

import java.util.Scanner;

/** Program to find Heron's / Hero's Formula */

public class Exercise44_HeronFormula {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 sides of a Triangle as Integer : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is : "+area);

	}

}
