package techment.model;

public class Department {
	
	String hodName;
	
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}



	void deptDetails()
	{
		System.out.println("This is department details");
		System.out.println("minimum 6 departments should be there");
		System.out.println("HOD name : "+hodName);
	}
}
