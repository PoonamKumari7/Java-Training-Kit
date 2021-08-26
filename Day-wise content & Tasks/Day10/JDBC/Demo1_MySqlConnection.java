package techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/** Program to understand JDBC connection */

public class Demo1_MySqlConnection {

	public static void main(String[] args) {

		//A o = new A();
		try
		{
			//Class.forName("techment.Day10.JDBC"); // will throw checked exception-ClassNotFoundException
			//step-1 load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver"); //package name
			System.out.println("Class is found");

			//add jar files 
			//project -> right click -> build path -> configure 
			System.out.println("Driver class loaded !");

			//step-2 create the connection obj using DriverManager(inbuilt class)
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "$adminME7$");
			System.out.println("Connected");
			
			//Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment2?autoReconnect=true&useSSL=false", "root", "$adminME7$");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
