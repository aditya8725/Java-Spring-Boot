
public class D10InterfaceTest 
{
	public static void main(String[] args) 
	{
	
	}
}

interface Proactive
{
	void proAct();
}

class Human
{
	void thinking()
	{
		System.out.println("Human is thinking....");
	}
}

class Person extends Human implements Proactive
{
	char gender;
	int age;
	String name;
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public void proAct() {
		System.out.println("Person is proacting.....");
		
	}
	
	
	
}
