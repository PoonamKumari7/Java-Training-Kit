package techment.practice;

public class Employee {

	    private String Fname;
	    private String Lname;
	    private String rank;
	    private double salary;

	    public Employee(String Fname, String Lname, String rank, double salary){
	        this.Fname = Fname;
	        this.Lname = Lname;
	        this.rank = rank;
	        this.salary = salary;
	    }
	    //getters and setters
	    public String getFname() {
	        return Fname;
	    }

	    public void setFname(String fname) {
	        Fname = fname;
	    }

	    public String getLname() {
	        return Lname;
	    }

	    public void setLname(String lname) {
	        Lname = lname;
	    }

	    public String getRank() {
	        return rank;
	    }

	    public void setRank(String rank) {
	        this.rank = rank;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}

