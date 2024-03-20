import java.util.Random;

public class ExceptionAssignment 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main....");
		
		Rocket r = null;
		
		try
		{
			r = new Rocket();
		}
		catch(IgnitionEception e)
		{
			System.out.println("Problem in ignition: "+e.getMessage());
		}
		catch(GravityException | BoosterException e)
		{
			System.out.println("Problem in Launch: "+e.getMessage());
		}
	}
}

class IgnitionEception extends RuntimeException
{

	public IgnitionEception(String message) 
	{
		super(message);
	}	
}

class GravityException extends RuntimeException
{
	public GravityException(String message)
	{
		super(message);	
	}
	
}

class BoosterException extends RuntimeException
{
	public BoosterException(String message) 
	{
		super(message);
	}
}

class Rocket
{
	boolean ignitionStatus;
	boolean boosterStatus;
	
	Rocket() throws IgnitionEception,BoosterException
	{
		System.out.println("Preparing for launch....");
		
		
		ignite();
		
		if(ignitionStatus)
		{
			System.out.println("Ignition Status");
		}
		else
		{
			throw new IgnitionEception("Abort!!!...Ignition failed. Rcket cannot launch");
		}
		
		checkBooster();
		if(boosterStatus)
		{
			System.out.println("Booster Ready..");
		}
		else
		{
			throw new BoosterException("Booster Malfunction. Launch Abort !!!!..");
		}
			System.out.println("Rocket is ready to Launch.....");
	}

	private void ignite() throws IgnitionEception
	{
		Random r = new Random();
		ignitionStatus = r.nextBoolean();
		
		if(!ignitionStatus)
		{
			throw new IgnitionEception("Ignition Failed!!!....");
		}
	}
	
	private void checkBooster()
	{
		Random r = new Random();
		boosterStatus = r.nextBoolean();
		
		if(!boosterStatus)
		{
			throw new BoosterException("Booster alfunction!!!....");
		}
	}
	
	
	void launch()
	{
		System.out.println("Rocket is launching...");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Altitude: "+i*100+ "meters");
			
			if(i==5)
			{
				throw new GravityException("Lost control due to gravity anomaly");
			}
		}
		System.out.println("Rocket Successfully reached orbit");

	}
}