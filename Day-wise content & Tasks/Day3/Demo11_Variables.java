package techment.Day3;

public class Demo11_Variables {

	int a =10;     //global
	int size =100; 

	void display1()
	{
		int hieght = 4; //local
		int size =1;
		System.out.println("a "+a+" hieght "+hieght+" size "+size+" global size "+this.size);
	}

	void display2()
	{
		int width = 5; //local
		System.out.println("a "+a+" width "+width);
	}

	public static void main(String[] args) {

		Demo11_Variables variables = new Demo11_Variables();

		variables.display1();
		variables.display2();

	}

}
