
public class D8HasaTest 
{
	public static void main(String[] args) 
	{
		Human h = new Human();
		h.thinking();
		h.feeling();
		h.sweetheart.pumping();
		
		h.rightlung.inhale();
		h.leftlung.exhale();
		h.kidney.filter();
		
		Poet p = new Poet();
		p.thinking();
		
		
		pen jelpen = new pen();
		paper whitepaper = new paper();
		p.imagine(jelpen, whitepaper);
	}
}

class Heart
{
	void pumping()
	{
		System.out.println("Pumping the blood");
	}
}

class Lung
{
	void inhale() 
	{
		System.out.println("inhaling...");
	}
	void exhale()
	{
		System.out.println("exhailing");
	}
}

class Kidney
{
	void filter()
	{
		System.out.println("Filterig....");
	}
}

class Human
{
	Heart sweetheart = new Heart(); // has A
	
	Lung rightlung = new Lung();
	Lung leftlung = new Lung();
	
	Kidney kidney = new Kidney();
	
	
//	we can do the above as well or the below  
	
//	Lung rightlung;
//	Lung leftlung;
	
	Human()
	{
		System.out.println("Human constructor...");
		
//		rightlung = new Lung();
//		leftlung = new Lung();
		
//		rightlung.inhale();
//		leftlung.inhale();
//		
//		rightlung.exhale();
//		leftlung.exhale();
				
	}
	
	
	public void kidney() {
	// TODO Auto-generated method stub
	
}


	void thinking()
	{
		System.out.println("Human is thinking");
	}
	
	void feeling()
	{
		System.out.println("Humar is feeling");
	}
}



//Has A

class pen
{
	void write()
	{
		System.out.println("Writing.....");
	}
}

class paper
{
	String line;
	
	void read()
	{
		System.out.println("Lines: "+line);
	}
}
class Poet extends Human
{
				//uses A pen  uses A paper
				//   |			|
	void imagine(pen thepen, paper paper)
	{
		System.out.println("Poet is imagining....");
		thepen.write();
		
		paper.line = "Helooeeeeee....\n";
		paper.line+="adityaaa....\n";
		paper.line+="Whatsappp....\n";
		
		paper.read();
	}
}