package techment.Assignment1;

import java.util.Scanner;

public class Exercise5_MyBirthMonth {

	public static void main(String[] args) {

		/* Program to accept the month of birth as number and displays appropriate message to print 
		the month name. Use Switch statement . If input is not a valid month number should show
		error message as Invalid Month */
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the month of birth : ");
		int birth_month = scanner.nextInt();
		
		switch(birth_month)
		{
		case 1: System.out.println("\nYour birthday month is 'January'");
		break;
		case 2: System.out.println("\nYour birthday month is 'February'"); 
		break;
		case 3: System.out.println("\nYour birthday month is 'March'");
		break;
		case 4: System.out.println("\nYour birthday month is 'April'");
		break;
		case 5: System.out.println("\nYour birthday month is 'May'");
		break;
		case 6: System.out.println("\nYour birthday month is 'June'");
		break;
		case 7: System.out.println("\nYour birthday month is 'July'");
		break;
		case 8: System.out.println("\nYour birthday month is 'August'"); 
		break;
		case 9: System.out.println("\nYour birthday month is 'September'");
		break;
		case 10: System.out.println("\nYour birthday month is 'October'");
		break;
		case 11: System.out.println("\nYour birthday month is 'November'");
		break;
		case 12: System.out.println("\nYour birthday month is 'December'");
		break;

		default : System.out.println("\nInvalid month");
		}
		

	}

}
