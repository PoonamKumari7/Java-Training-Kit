package techment.Day8.Collection;

public class Demo1_HashCode {

	public static void main(String[] args) {


		String a = "Hello";
		String b = "Java";
		
		Integer x = 123;
		
		System.out.println(a.hashCode()); //hascode generates random number
		System.out.println(b.hashCode());
		System.out.println(x.hashCode());

	}

}
