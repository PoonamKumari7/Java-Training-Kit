package techment.model;

public class Restraunt {
	
	String restrauntName;
	//Tea tea;
	IHotDrink hotDrink;
	ISoftDrink softDrink;

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	
//	public void setTea(Tea tea) {
//		this.tea = tea;
//	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}


	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}


	public void displayRestrauntDetails()
	{
		System.out.println("Restraunt Name : "+restrauntName);
//		System.out.println("Price of tea : "+tea.price);
//		tea.message();
		hotDrink.drink();
		softDrink.drink();
	}

}
