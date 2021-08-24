package techment.Assignment4_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author POONAM
 *Create a class ScoreCard with a main method to analyze the runs scored by batsmen of a team. The input data format is given below. The program needs to output as given below. Use a concrete class of Map to achieve the functionality.

Sample Input
-------------
Enter Runs Scored
Rahane-20 Rahul-30 Kohli-150 Dhoni-50 Lokesh-2


Sample Output
-------------
Players who batted
Dhoni
Kohli
Lokesh
Rahane
Rahul

Scores by Players
Dhoni : 50
Kohli : 150
Lokesh : 2
Rahane : 20
Rahul  : 30

Total Score : 202

Name of Highest Scorer : Kohli

Runs Scored by Dhoni : 50
 */

public class Exercise3_ScoreCard {

	public static void main(String[] args) {
		
int TotalScore =0;	
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Rahul",35);
		hm.put("Dhoni",150);
		hm.put("Kohli",45);		
		hm.put("Rahane",20);
		hm.put("Rohit", 200);
				
		TreeMap<String,Integer> sorted = new TreeMap(hm);
		
		System.out.println("\nPlayers who batted");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
			System.out.println(entry.getKey());
			
		}
		
		System.out.println("\nScores  by players");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{	
			TotalScore = TotalScore+entry.getValue();
			System.out.println( entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("\nTotalScore : "+TotalScore);
		
		System.out.print("\nHighest scorer : ");			
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		    
		}
		System.out.println(maxEntry.getKey());
	
		System.out.println("Runs Scored by Dhoni : "+ sorted.get("Dhoni"));
		
		
		
	}

}
