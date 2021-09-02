package techment.self;

import java.util.Scanner;

public class SwitchUnderWhile {
	
		/** Enter 3 sides of the triangle into 3 variables and check if sum of any
			two sides is always bigger than the third side . */
	
		public static void main(String[] args)
		{
					int AB,BC,CA;
					Scanner sc= new Scanner(System.in);
					System.out.print("Enter 1st side 'AB' : ");
					AB=sc.nextInt();
					System.out.print("Enter 2nd side 'BC' : ");
					BC=sc.nextInt();
					System.out.print("Enter 3rd side 'AC' : ");
					CA=sc.nextInt();
					
					System.out.println("\n==========================");
					
					if((AB+BC)>CA || (BC+CA)>AB || (AB+CA)>BC)
						System.out.println("Triangle can be formed.");
					else
						System.out.println("Triangle cannot be formed");

					System.out.println("==========================");

				}

			}



