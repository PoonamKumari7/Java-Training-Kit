package techment.model;

/** 1st way of creating objects in Spring - XML based configuration */

public class Bank {
	
	String name;
	String ifscCode;
	String branch;
	
	//setter to pass the value
	public void setName(String name) {
		this.name = name;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
	
	
	
	//toString for printing the values
	
	//method
	public void displayBankDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("IFSC code : "+ifscCode);
		System.out.println("Branch : "+branch);
	}
	

}
