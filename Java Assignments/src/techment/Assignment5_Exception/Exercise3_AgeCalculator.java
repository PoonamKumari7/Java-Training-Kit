package techment.Assignment5_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Age
{
	private int days;
	private int months;
	private int years;

	private Age()
	{
		//default constructor
	}

	public Age(int days, int months, int years)
	{
		this.days = days;
		this.months = months;
		this.years = years;
	}

	public int getDays()
	{
		return this.days;
	}

	public int getMonths()
	{
		return this.months;
	}

	public int getYears()
	{
		return this.years;
	}

	@Override
	public String toString()
	{
		return years + " Years" ;//+ months + " Months, " + days + " Days";
	}
}
public class Exercise3_AgeCalculator {

	private static Age calculateAge(Date birthDate)
	{
		int years = 0;
		int months = 0;
		int days = 0;

		//create calendar object for birth day
		Calendar birthDay = Calendar.getInstance();
		birthDay.setTimeInMillis(birthDate.getTime());

		//create calendar object for current day
		long currentTime = System.currentTimeMillis();
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(currentTime);

		//Get difference between years
		years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
		int currMonth = now.get(Calendar.MONTH) + 1;
		int birthMonth = birthDay.get(Calendar.MONTH) + 1;

		//Get difference between months
		months = currMonth - birthMonth;

		//calculate the number of months
		if (months < 0)
		{
			years--;
			months = 12 - birthMonth + currMonth;
			if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
				months--;
		} else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
		{
			years--;
			months = 11;
		}

		//Calculate the days
		if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
			days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
		else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
		{
			int today = now.get(Calendar.DAY_OF_MONTH);
			now.add(Calendar.MONTH, -1);
			days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
		} 
		else
		{
			days = 0;
			if (months == 12)
			{
				years++;
				months = 0;
			}
		}
		//Create new Age object 
		return new Age(days, months, years);
	}

	public static void main(String[] args) throws ParseException{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter DOB : ");
		String dob = scanner.nextLine();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date birthDate = sdf.parse(dob);     
			Age age = calculateAge(birthDate);
			System.out.println(age);
		}
		catch (Exception e) {
			System.out.print("\n");
			System.out.println(e);
			System.out.println("\nDate of Birth should be in dd/mm/yyyy format");
		}

		//		if(dob == "dd/MM/yyyy" )
		//		{
		//			Date birthDate = sdf.parse(dob);     
		//			Age age = calculateAge(birthDate);
		//			System.out.println(age);	
		//		}
		//		else
		//		{
		//			System.out.println("Date of Birth should be in dd/mm/yyyy format");
		//		}


	}
}


