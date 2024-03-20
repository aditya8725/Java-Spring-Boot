
public class D10FinalTest 
{
	public static void main(String[] args) 
	{
		final float PI=3.14f;
		System.out.println("PI "+PI);
		
//		PI= 2.19f;
		System.out.println("PI "+PI);
		
		chess ch = new chess();
		ch.moveBishop();
		
		chess gc = new Graphicalchess();
		gc.moveBishop();
				
	}
}

class chess
{
	final void moveBishop()
	{
		System.out.println("Moving bishop diagnoally....back/forward...");
	}
	
	void moveRook()
	{
		System.out.println("Moving rook vertically/horizontally...");
	}
}

class Graphicalchess extends chess
{
	//cannot override the final
	void mymoveBishop()
	{
		System.out.println("Moving bishop diagnoally on a graphical board....back/forward...");
	}
}