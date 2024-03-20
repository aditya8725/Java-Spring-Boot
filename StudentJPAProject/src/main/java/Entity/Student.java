package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_tbl")
public class Student 
{
	@Id
	@Column(name="Stud_Rollno")
	private int Stud_Roll;
	
	@Column(name="Stud_name")
	private String Stud_name;
	
	@Column(name="Stud_class")
	private String Stud_class;

	public Student() {
		super();
	}

	public int getStud_Roll() {
		return Stud_Roll;
	}

	public void setStud_Roll(int stud_Roll) {
		Stud_Roll = stud_Roll;
	}

	public String getStud_name() {
		return Stud_name;
	}

	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}

	public String getStud_class() {
		return Stud_class;
	}

	public void setStud_class(String stud_class) {
		Stud_class = stud_class;
	}
	
	
}
