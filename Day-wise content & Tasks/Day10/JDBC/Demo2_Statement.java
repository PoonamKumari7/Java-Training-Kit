package techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/** Program to understand way of inserting values into Database using 'Statement' */

public class Demo2_Statement {

	public static void main(String[] args) {
		
		try
		{
			//step-1 load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class is found");
			System.out.println("Driver class loaded !");

			//step-2 create the connection obj 
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "$adminME7$");
			System.out.println("Connected");
			
			//step-3 create statement or prepare statement
			Statement statement = con1.createStatement();
			statement.execute("insert into employee values(3, 'Poonam', 90000);"); //static data
			System.out.println("Value inserted");
			
			//printing table on console
			ResultSet rs = statement.executeQuery("select * from employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));	
			}
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}