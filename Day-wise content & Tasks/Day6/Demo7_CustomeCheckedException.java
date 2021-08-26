package techment.Day6;

class LateException extends Exception
{
	public LateException(String msg)
	{
		super(msg);
	}
}

class StudentClass
{
	void login(int time) throws LateException
	{
		if(time>9)
			throw new LateException("You are absent!");
		else
			System.out.println("You are present.");
	}
}

public class Demo7_CustomeCheckedException {

	public static void main(String[] args) throws LateException {

		StudentClass student = new StudentClass();
		try
		{
			student.login(10);
		}
		catch (LateException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
