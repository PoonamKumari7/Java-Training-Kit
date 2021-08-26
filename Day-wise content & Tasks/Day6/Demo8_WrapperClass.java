package techment.Day6;

/** Program to understand autoboxing and unboxing */ 

public class Demo8_WrapperClass {

	public static void main(String[] args) {
		
		int a = 100;
		
		Integer b=a; //autoboxing - converts from primitive to obj
		
		int c = b.intValue(); //unboxing - converts from obj to primitive 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
