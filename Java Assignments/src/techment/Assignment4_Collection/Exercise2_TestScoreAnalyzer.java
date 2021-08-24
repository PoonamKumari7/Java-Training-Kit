package techment.Assignment4_Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author POONAM
 *2 – Cricket Score Analyzer
Create a Class ScoreAnalyzer with a private instance variable 'runsData' of type LinkedList.
The linkedlist will store runs scored by individual players in One Day Cricket match.
Create a constructor and initialize runsData variable.

•	Create a method addRunsToList which accepts runs scored by a player as parameter and stores it in the List.
•	Create a method calcRunRate which returns the runRate (Consider all 50 overs were played by a team).
•	Create a method lowestRunsScored to return the lowest runs scored by a player.
•	Create a method displayRuns to display the runs scored by all players.(use for each loop)

Create class TestScoreAnalyzer with a main method. 
•	Create an object of ScoreAnalyzer
•	Use Scanner to get the runs scored and use addRuns method to store the runs
•	Display the runs scored by all players
•	Display the runrate
•	Display the lowest runs scored
•	Display the count of player who did batting

Sample input
Enter Runs
20 30 150 50 2
 
Sample Output
Runs Scored : 1-20 2-30 3-150 4-50 6-2
Runrate : 5.04
Lowest Runs : 2
Count of player who batted: 5
 */
class CricketScoreAnalyzer
{
	private LinkedList<Integer> runsData = new LinkedList<Integer>();

	public CricketScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	/*****************Taking Runs from user & stores in list********************/
	public void addRunsToList()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Runs scored by Players : ");
		for(int i=0; i<runsData.size(); i++)
		{
			System.out.print((i+1)+"-");
			int runs = scanner.nextInt();
			runsData.add(runs);
		}			
	}
	/*******************Calculating run rate***************************/
	/**2nd way-
	 * double total_runs = 0;
		for(dint i : runsData)
		{
			total_runs += i;
		}
		double run_rate = total_runs/50;
		System.out.println("\nRun rate : " +run_rate);	
	 * 
	 */
	public void calcRunRate()
	{
		double total_runs = 0;
		for(int i=0; i<runsData.size(); i++)
		{
			total_runs += runsData.get(i);
		}
		double run_rate = total_runs/50; 
		System.out.println("\nRun rate : " +run_rate);
	}
	
	/*******************lowest runs scored by a player*********************/
	public void lowestRunsScored()
	{
		System.out.println("Lowest Run : " + Collections.min(runsData));
	}
	
	/*************display the runs scored by all players*****************/
	/**2nd way-
	 * /*for(int i : runsData)
		{
			System.out.println(i);
		}
		System.out.println();
		
		3rd way-
		System.out.print("Runs Scored : ");
		for(int i=0; i<runsData.size(); i++)
		{
			System.out.print((i+1)+ "-" +runsData.get(i)+ "  ");
		}
	 * 
	 */
	public void displayRuns()
	{
		Iterator<Integer> itr = runsData.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}
	
}

public class Exercise2_TestScoreAnalyzer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Players : ");
		int total_number = scanner.nextInt();
		
		LinkedList<Integer> runslist = new LinkedList<Integer>();
		CricketScoreAnalyzer score_analyzer = new CricketScoreAnalyzer(runslist);
		
		score_analyzer.addRunsToList();
		score_analyzer.calcRunRate();
		score_analyzer.lowestRunsScored();
		score_analyzer.displayRuns();
		System.out.println("Count of player who batted : "+ total_number);
		}
		
		
	}