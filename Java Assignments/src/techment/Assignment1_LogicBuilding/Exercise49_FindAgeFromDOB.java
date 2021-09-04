package techment.Assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

/** Accept the date of birth of employee in yyyy-mm-dd format.
	Use Calendar and SimpleDateFormat in java to parse the date entry.
	Calculate the age by subtracting the dob year from the current year.
	Needs to consider the month and day values while calculating age. */


public class Exercise49_FindAgeFromDOB {

	public static Date StringToDate(String dob) throws ParseException{
		
		//Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		//Parsing the given String to Date object
		Date date = formatter.parse(dob);
		System.out.println("Date object value: "+date);
		return date;
	}

	public static void main(String[] args) throws ParseException {

		//Taking name and date of birth from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee name: ");
		String name = sc.nextLine();
		System.out.print("Enter date of birth of employee (YYYY-MM-DD) : ");
		String dob = sc.next();

		//Converting String to Date
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
		Date date = formatter.parse(dob);

		//Converting obtained Date object to LocalDate object
		Instant instant = date.toInstant();

		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate enteredDate = zone.toLocalDate();

		//Calculating the difference between given date to current date.
		Period period = Period.between(enteredDate, LocalDate.now());

		System.out.print("\nCurrent age of Employee "+"'"+name+"'"+" is : ");
		System.out.print(period.getYears()+" years "+period.getMonths()+" and "+period.getDays()+" days");
	}

}



