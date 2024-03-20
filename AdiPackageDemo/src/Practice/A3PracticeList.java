package Practice;

public class A3PracticeList {

	public static void main(String[] args) 
	{
		anypair a = new anypair(10, 20);
		
		System.out.println("anypair "+a);
		a.swap();
		System.out.println("anypair "+a);
	}

}

class anypair
{
	private int i;
	private int j;
	public anypair(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "anypair [i=" + i + ", j=" + j + "]";
	}
	
	public void swap()
	{
		System.out.println("Before swap");
		int temp = i;
		i=j;
		j=temp;
		System.out.println("After swap");
	}
}
