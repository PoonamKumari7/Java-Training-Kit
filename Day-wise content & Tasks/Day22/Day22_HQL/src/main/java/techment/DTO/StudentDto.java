package techment.DTO;

/**
 * 
 * @author POONAM
 * to prevent class cast
 */
public class StudentDto {
	
	int studentId;
	String studentName;
	String deptName;

	//constructors
	public StudentDto() {
		super();
	}

	public StudentDto(int studentId, String studentName, String deptName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.deptName = deptName;
	}

	//getter and setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
		
}
