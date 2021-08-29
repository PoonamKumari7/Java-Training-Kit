package techment.Day11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo2_Date {

	public static void main(String[] args) {
		
		//gives current date
		LocalDate date = LocalDate.now(); 
		System.out.println(date);
		
		//current date with time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//initializing value which we want
		LocalDate birthDate = LocalDate.of(2000, 11, 30);
		System.out.println(birthDate);
		
		//will check current date is after birthdate or not
		System.out.println(date.isAfter(birthDate));
		
	}

}
