package techment;

import org.springframework.jdbc.core.JdbcTemplate;

public class MySql_Demo {
	
	JdbcTemplate jdbcTemplate;

	//generate setters
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//method to insert values in DB
	public void insertData()
	{
		jdbcTemplate.execute("insert into employee values(200, 'Poonam',77000)" );
		System.out.println("Data is inserted in 'employee' table...");
	}
	
}
