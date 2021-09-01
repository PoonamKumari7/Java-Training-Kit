package techment.SelectQuery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                    //Entity annotation-Creating Entity
@Table(name="student500") //Table annotations-defining table name
public class Student {

	@Id
	int studentId;
	String studentName;
	String studentDept;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setName(String name) {
		this.studentName = name;
	}

	public String getstudentDept() {
		return studentDept;
	}
	public void setDept(String dept) {
		this.studentDept = dept;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + studentName + ", dept=" + studentDept + "]";
	}
}