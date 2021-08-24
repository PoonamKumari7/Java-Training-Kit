package techment.Assignment3_OOPs;

import java.util.Scanner;

interface Rewardable 
{
	int CalcRewardPoints(int amount);
}
abstract class PrepaidCard 
{
	int CardNo;
	double availableBalance,swipeLimit;
	
	 public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		CardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}
	boolean swipeCard (int amount)
	{
		 if(amount < swipeLimit && amount < availableBalance )
		return true;
		 else
			 return false;
	}
	@Override
	public String toString() {
		return "\nPrepaidCard - [ CardNo : " + CardNo + ", availableBalance : " + availableBalance + ", swipeLimit : " + swipeLimit
				+ " ]";
	}
	 
	public void rechargeCard (int amount)
	{
		availableBalance=availableBalance+amount;
	}
	
}

class TravelCard extends PrepaidCard implements Rewardable  
{
	int rewardspoints;
	

	

	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
	}
	
	@Override
	public int CalcRewardPoints(int amount) {
		rewardspoints =(int)(amount/100);
		return rewardspoints;
	}
}

public class Exercise3_InheritanceAndAbstraction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Card Number : ");
		int cardnumber = scanner.nextInt();
		System.out.print("Enter Available Balance : ");
		int balance = scanner.nextInt();
		System.out.print("Enter swipe Limit: ");
		int Limit = scanner.nextInt();
		
		TravelCard card = new TravelCard(cardnumber, balance, Limit);
		card.toString();
		System.out.println(card.toString());
		
		System.out.print("\nPlease Enter the swipe amount : ");
		int withrawamount = scanner.nextInt();
		
		if(card.swipeCard(withrawamount)==true)
		{
			System.out.println("\nRewards Points Earned : " +card.CalcRewardPoints(withrawamount) );
		}
		else
			System.out.println("Entered Amout is Too high to withdraw !");
	}

}
