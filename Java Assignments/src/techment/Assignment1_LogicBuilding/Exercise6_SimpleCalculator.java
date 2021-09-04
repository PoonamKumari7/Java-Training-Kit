package techment.Assignment1;

import java.util.Scanner;

public class Exercise6_SimpleCalculator {

	public static void main(String[] args) {
		
		/* Program to accept two numbers and an operator to perform mathematical operation
		on the operands and display the result as output. Using Switch statement. */ 
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		char operator;
		
		System.out.print("Enter first number : ");
		num1 = scanner.nextInt();
		System.out.print("Enter second number : ");
		num2 = scanner.nextInt();
		
		//System.out.print("Choose operator : 1.(+) 2.(-) 3.(*) 4.(/) ");
		//int choice = scanner.nextInt();
		
		System.out.print("Choose operator : + , - , * , / ");
		operator = scanner.next().charAt(0);
		
		int add, sub, mul;
		float div;
		switch(operator)
		{
		case '+' : add = num1 + num2;
				   System.out.println("Result : "+add);
				   break;
		case '-' : sub = num1 - num2;
				   System.out.println("Result : "+sub);
				   break;
				
		case '*' : mul = num1 * num2;
				   System.out.println("Result : "+mul);
				   break;
		
		case '/' : div = num1 / num2;
				   System.out.println("Result : "+div);
				   break;
		
		default :  while (operator!= '+' || operator!= '-' || operator!= '*' || operator!= '/') 
		{
			System.out.println("Invalid Operator...Please choose correct operator !");
			System.out.println("+ , - , * , / ");
			char operator1 = scanner.next().charAt(0);
			
			if(operator1 == '+')
			{
				add = num1 + num2;
				System.out.println("Result : "+add);
				break;
			}
			else if (operator1 == '-') 
			{
				sub = num1 - num2;
				System.out.println("Result : "+sub);
				break;
			}
			else if(operator1 == '*')
			{
				mul = num1 * num2;
				System.out.println("Result : "+mul);
				break;
			}
			else if(operator1 == '/')
			{
				div = num1 / num2;
				System.out.println("Result : "+div);
				break;
			}
			
		}
		
		}
	}
}
		

			
		
				

	
