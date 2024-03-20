
public class D10Staticclass 
{
	public static void main(String[] args) 
	{
		circle c1 = new circle(50);
		c1.calculateAera();
		c1.calculatePerimeter();
		
		circle c2 = new circle(60);
		c2.calculateAera();
		c2.calculatePerimeter();
	}
}


class circle
{
	int radius;
	static final float PI = 3.14f;
	//static means one copy for the entire program.
	
	public circle(int radius) {
		super();
		this.radius = radius;
	}
	
	void calculateAera()
	{
		float area = PI * radius * radius;
		System.out.println("Area if circle "+area);
	}
	
	void calculatePerimeter()
	{
		float perimeter = 2*PI* radius;
		System.out.println("Perimeter of cirlce: "+perimeter);
	}
	
}
