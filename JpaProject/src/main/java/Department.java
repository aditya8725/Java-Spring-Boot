import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mydept")
public class Department 
{
	@Id
	@Column(name="DEPTNO")
	int deptNumber;
	
	@Column(name="DEPTNO")
	String departName;
	
	@Column(name="LOC")
	String departLoc;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getDepartLoc() {
		return departLoc;
	}
	public void setDepartLoc(String departLoc) {
		this.departLoc = departLoc;
	}

}
