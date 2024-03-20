package Practice;

import java.util.Random;

public class A2practiceRocket 
{
	

}


class ignitionExceptio extends Exception
{
	public ignitionExceptio(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class boosterexception extends Exception
{
	public boosterexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class gravityexception extends RuntimeException
{

	public gravityexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class rockeett
{
	boolean ignitionstatus;
	boolean boosterstatus;
	
	private void checkIgnition()
	{
		Random r = new Random();
		ignitionstatus = r.nextBoolean();
	}
	
	private void boosterstatus()
	{
		Random r = new Random();
		boosterstatus = r.nextBoolean();
	}

	public rockeett() throws boosterexception,ignitionExceptio
	{
		checkIgnition();
		if(ignitionstatus == true);
		{
			
		}
		else
			
	}
	
	
	
	
	
}