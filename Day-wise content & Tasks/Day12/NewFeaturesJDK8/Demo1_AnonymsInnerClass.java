package techment.Day12.NewFeaturesJDK8;

class Parent
{
	void phone()
	{
		System.out.println("mi");
	}
}

public class Demo1_AnonymsInnerClass { //for overriding purpose only 

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.phone();
		
		System.out.println("By using anonymous way");
		Parent parent2 = new Parent()
		{
			void phone()
			{
				System.out.println("samsung");
			}
		};
		
		parent2.phone();

	}

}
