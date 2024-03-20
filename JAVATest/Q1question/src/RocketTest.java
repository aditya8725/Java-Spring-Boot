import rocket.station.exception.BoosterException;
import rocket.station.exception.LaunchException;
import rocket.station.*;

public class RocketTest {

		public static void main(String[] args) 
		{

			try {
				RocketLauncher r = new RocketLauncher();
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

