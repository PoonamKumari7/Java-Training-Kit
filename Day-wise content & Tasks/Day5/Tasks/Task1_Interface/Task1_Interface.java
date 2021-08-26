package techment.Day5.Tasks.Task1_Interface;

public class Task1_Interface {

	public static void main(String[] args) {
		
		JdbcConnection connection = new MySql();
		connection.connect();
		
		//JdbcConnection connection = new Oracle();
		//connection.connect();

	}
}
