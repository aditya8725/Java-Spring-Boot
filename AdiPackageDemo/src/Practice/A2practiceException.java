package Practice;
import java.util.Random;

public class A2practiceException 
{
	public static void main(String[] args) 
	{
		discoCar dc;
		try
		{
			dc = new discoCar();
			dc.longDrive();
		}
		catch(cooleantException e)
		{
			System.out.println("Coolant exception "+e.getMessage());
		}
		catch(fuelException e)
		{
			System.out.println("Fuel Exception"+e.getMessage());
		}
		catch(trafficException e)
		{
			System.out.println("Traffic Exception "+e.getMessage());
		}
		catch(speedLimitException e)
		{
			System.out.println("Speed Exception"+e.getMessage());
		}
	}
}

//checked
class cooleantException extends Exception
{

	public cooleantException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class fuelException extends Exception
{

	public fuelException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}


//unchecked
class speedLimitException extends RuntimeException
{

	public speedLimitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class trafficException extends RuntimeException
{

	public trafficException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class discoCar
{
	boolean coolantStatus;
	boolean fuelStatus;
	
	private void checkCoolant()
	{
		Random r = new Random();
		coolantStatus = r.nextBoolean();
	}
	
	private void fuelCheck()
	{
		Random r = new Random();
		fuelStatus = r.nextBoolean();
	}
	
	
	discoCar() throws cooleantException, fuelException
	{
		checkCoolant();
		if(coolantStatus == true)
		{
			System.out.println("Cooleant ok.....");
		}
		else
		{
			cooleantException ce = new cooleantException("LOw cooleant .....Action Required..");
			throw ce;
		}
		
		fuelCheck();
		if(fuelStatus == true)
		{
			System.out.println("Fuel OK");
		}
		else
		{
			fuelException fe = new fuelException("LOW Fuel....");
			throw fe;
		}
		System.out.println("All okkk....");
	}
	
	void longDrive()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("KM Completed: "+i);
			
			double val = Math.random();
			int rno = (int)(val*10)+1;

			if(rno>70)
			{
				System.out.println("Your speed is:"+rno);
				speedLimitException se = new speedLimitException("Speed Limit exception...");
				throw se;
			}
			
			
			
			val = Math.random();
			rno = (int)(val*10)+1;
			
			if(rno>70)
			{
				System.out.println("Your speed is:"+rno);
				trafficException te = new trafficException("Traffic exception...");
				throw te;
			}
			
		}
		System.out.println("Jounery complete..");
	}
}