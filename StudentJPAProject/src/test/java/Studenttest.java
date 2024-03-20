import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import Entity.Student;

public class Studenttest 
{
	EntityManager manager;

	public Studenttest() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		manager = factory.createEntityManager();
		System.out.println("Manager Created");
	}
	
	@Test
	public void createStudent()
	{
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		Student st = new Student();
		st.setStud_Roll(2);
		st.setStud_name("Aditya");
		st.setStud_class("Twelth");
		
		manager.persist(st);
		trans.commit();
		System.out.println("Object persisited..");
	}
	
	@Test
	public void updateStudent()
	{
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		Student st = manager.find(Student.class,1);
		Assertions.assertTrue(st!=null);
		st.setStud_name("Ranjan");
		st.setStud_class("Eleventh");
		manager.merge(st);
		trans.commit();
		System.out.println("Object persisited..");
	}
	
	@Test
	public void DeleteStudent()
	{
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		Student st = manager.find(Student.class,1);
		Assertions.assertTrue(st!=null);
		manager.remove(st);
		trans.commit();
	}

	@Test
	public void selectstudent()
	{
		System.out.println("Try to find the student...");
		Student st = manager.find(Student.class,1);
		Assertions.assertTrue(st!=null);
		System.out.println("Student roll: "+st.getStud_Roll());
		System.out.println("Student name: "+st.getStud_name());
		System.out.println("Student Class: "+st.getStud_class());	
	}
	
	@Test
	public void selectallStudent()
	{
		Query q = manager.createQuery("from Student");
		List<Student> staff = q.getResultList();
		for(Student st: staff)
		{
			System.out.println("Student roll: "+st.getStud_Roll());
			System.out.println("Student name: "+st.getStud_name());
			System.out.println("Student Class: "+st.getStud_class());
		}
	}
}
