import java.util.Random;

import rocket.station.*;
import rocket.station.exception.BoosterException;
import rocket.station.exception.LaunchException;

public class RocketTest {

	public static void main(String[] args) 
	{
		RocketLauncher r;
		try {
			r = new RocketLauncher();
			r.launch();
		} catch (BoosterException e) {
			System.out.println("Booster Exception..."+e.getMessage());
		}
		catch(LaunchException e)
		{
			System.out.println("Launching Exception...."+e.getMessage());
		}
		
	}

}

class RocketLauncher
{
	boolean Boosterstatus;



	public RocketLauncher() throws BoosterException
	{
		double val = Math.random();
		int rano = (int)(val*10)+1;
		
		if(rano<90)
		{
			System.out.println("Booster Status OK....");
		}
		else
		{
			BoosterException be = new BoosterException("Abort!!!.... Error in booster");
			throw be;
		}
	}
	
	void launch()
	{
		for(int i=1;i<20;i++)
		{
			System.out.println("Total KM :"+i*10);
			
			double val = Math.random();
			int rno = (int)(val*10)+1;
			
			if(rno<30)
			{
				LaunchException le = new LaunchException("Launching Error.....");
				throw le;
			}
		}
		System.out.println("Ready to Launch Go Ahead.....");
	}
	

}