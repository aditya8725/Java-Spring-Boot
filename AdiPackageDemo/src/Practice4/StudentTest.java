package Practice4;

public class StudentTest {

	public static void main(String[] args) 
	{
		studentdaopoji studobj = new Studentdoaimpl();
		
//		Student s = new Student();
//		s.setStudentrollno(2);
//		s.setStudentname("Jwalithaa");
//		s.setStudentclass("Twelth");
//		
//		studobj.creatStudent(s);
		
		Student stu = studobj.readStudent(1);
		System.out.println("Roll no. "+stu.getStudentrollno());
		System.out.println("Name "+stu.getStudentname());
		System.out.println("Class "+stu.getStudentclass());

	}

}
