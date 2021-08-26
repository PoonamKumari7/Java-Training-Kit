package techment.Day4.SuperVariable;

public class Child extends Parent {

	int a = 20;

	void sum()
	{
		int c = a +a ;
		System.out.println("sum : "+c);
	}

	//---------------------------------------
	int b = 10;  //global variable for the child class
	void sum1()
	{
		int b = 5;  //local variable 
		int c=b+b;
		System.out.println("Sum c : "+c);	//5+5

		int d = this.b+b;
		System.out.println("sum d : "+d);	//this.b = will take child class variable i.e b=10

		int e = super.b + b;
		System.out.println("sum e : "+e);	//super.b = will take parent class variable i.e b=20

		int f = super.b+this.b+b;
		System.out.println("sum f : "+f);	//20+10+5
	}

}
