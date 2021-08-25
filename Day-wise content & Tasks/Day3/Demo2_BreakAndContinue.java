package techment.Day3;

public class Demo2_BreakAndContinue {

	public static void main(String[] args) {
		
		System.out.println("start");
		System.out.println();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"car");
			
			if(i==3)  //if(i>3)
				continue;  //skip the remaining statement & go for next iteration
			
			if(i==3)
				break; //break Terminates the loop
			
			System.out.println(i+" Laptop");
			System.out.println();
		}
		System.out.println("end");
	}
}
