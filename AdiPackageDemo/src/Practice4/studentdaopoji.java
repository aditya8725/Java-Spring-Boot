package Practice4;
import java.util.*;

public interface studentdaopoji 
{
	//crudl
	void creatStudent(Student studobj);
	void updateStudent(Student stubobj);
	void deleteStudent(int studentrollno);
	Student readStudent(int studentrollno);
	List<Student> readStudents();
	
}
