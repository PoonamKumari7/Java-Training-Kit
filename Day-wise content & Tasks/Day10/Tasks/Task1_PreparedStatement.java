package techment.Day10.Tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * 
 * @author POONAM
 * 
 * Task-1 
 * 
 * Use prepare statement
 * Take id, name & salary from user and insert it into database employee
 *
 */

public class Task1_PreparedStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try
		{
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");

			//create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "$adminME7$");
			System.out.println("Connected");

			//prepare statement
			PreparedStatement ps = con.prepareStatement("Insert into employee values( ?, ?, ?)");

			System.out.print("Enter the total number of records : ");
			int n = scanner.nextInt();

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

			for(int i=0; i<n; i++)
			{
				System.out.print("\nEnter id : ");
				int empid = scanner.nextInt();
				ps.setInt(1, empid);

				System.out.print("Enter Name : ");
				String empname = br.readLine();
				ps.setString(2, empname);

				System.out.print("Enter salary : ");
				int empsalary = scanner.nextInt();
				ps.setInt(3, empsalary);

				ps.execute();	
			}

			System.out.println("\n-------------------");
			System.out.println("Records Inserted");
			System.out.println("-------------------\n");

			ResultSet rs= ps.executeQuery("select * from employee");  
			while(rs.next()){  
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
			}  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
