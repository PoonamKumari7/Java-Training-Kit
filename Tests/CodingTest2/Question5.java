package techment.CodingTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question5 {

	public void voterList() throws ParseException {
		
		//User input : total number of people 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total number of people came for Voting : ");
		int size = scanner.nextInt();
		System.out.println("=====================================================");
		
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		int keyID;
		String valueDOB;
		for (int i = 0; i <size; i++) 
		{
			{
			System.out.print("Enter the ID : ");
			keyID = scanner.nextInt();
			System.out.print("Enter the DOB : ");
			valueDOB = scanner.next();	
			
			}
			
		//convert date of birth from string to Date
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = dateFormatter.parse(valueDOB);

		//Converting obtained Date object to LocalDate object
		Instant instant = date.toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();
		System.out.println();
		Period period = Period.between(givenDate, LocalDate.now());

		System.out.print("Current age of ID-" +keyID+ " is: "+ period.getYears() +" Years\n");
		System.out.println();
		
		//checks eligibility to give vote
		if(period.getYears()>18)
		{
			System.out.println("Eligible\n");
			hmap.put(keyID, period.getYears());
			System.out.println("=====================================================");
		}
		
		else
		{
			System.out.println("Not eligible\n");
			System.out.println("=====================================================");

		}
		
		}

		//collect map keys to list
		List ListofKeys = hmap.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("ID of the Eligible people : " +ListofKeys.toString());
		System.out.println("=====================================================");
		
//		hmap.entrySet().forEach(hmap_entry -> {
//			   System.out.print("ID : "+hmap_entry.getKey() +"\n");
//			        });	
		
	}

public static void main(String[] args) throws ParseException{
	// TODO Auto-generated method stub

	Question5 question5 = new Question5();
	question5.voterList();	
}
}
