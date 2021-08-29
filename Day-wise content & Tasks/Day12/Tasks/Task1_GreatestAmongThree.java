package techment.Day12.NewFeaturesJDK8;

interface greatest
{
	String great(int a, int b, int c);
}

public class Task1_GreatestAmongThree {

	public static void main(String[] args) {

		greatest great =(a,b,c) -> //multiline body
		{
			if(a>b && a>c )
				return a+ " is largest ";
			else if(b>a && b>c)
				return b+ " is largest ";
			else 
				return c+ " is largest ";				
		};

		System.out.println(great.great(6, 9, 8));

	}

}
