package techment.Day5.Tasks.Task1_Interface;

public class Oracle implements JdbcConnection {

	@Override
	public void connect() {
		
		System.out.print("I am connecting to ORACLE DATABASE...");

	}

}
