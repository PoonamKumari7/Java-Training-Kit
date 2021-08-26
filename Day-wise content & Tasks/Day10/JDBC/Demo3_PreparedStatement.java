package techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/** Program to understand way of inserting values into Database using 'Prepared Statement' */

public class Demo3_PreparedStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID : ");
		int id = scanner.nextInt();
		
		try
		{
			//step-1 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class is found");
			System.out.println("Driver class loaded !");

			//step-2 
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "$adminME7$");
			System.out.println("Connected");
			
			//step-3 
			PreparedStatement ps = con1.prepareStatement("insert into employee values(?, ?, ?);"); //dynamic data
			ps.setInt(1, id);
			ps.setString(2, "Rahul");
			ps.setInt(3, 47500);
			
			ps.execute();
			System.out.println("Value inserted");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}