package techment.Day4.Polymorphism;

/**
 * Program to understand Method Overloading
 * 
 * @author POONAM
 *	Polymorphism 
 *	1. overloading - method name same with diff parameter
 *	2. Overriding - child class doesn't satisfy with parent class implementation 
 *					then child class can override 
 *
 */

public class Demo1_Overloading {

	public static void main(String[] args) {
		
		Hello1 hello = new Hello1();
		hello.write("Welcome");
		hello.write(777777);

	}

}
