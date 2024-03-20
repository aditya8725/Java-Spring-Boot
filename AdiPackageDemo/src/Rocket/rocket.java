package Rocket;

import java.util.Random;

import RocketException.ignitionException;
import RocketException.boosterExcetpion;
import RocketException.gravityException;

public class rocket
	{
		boolean ignitestatus;
		boolean boosterstatus;
		
		public void checkignite()
		{
			Random r = new Random();
			ignitestatus = r.nextBoolean();
		}
		
		public void checkBooster()
		{
			Random r = new Random();
			boosterstatus = r.nextBoolean();
		}
		
		public rocket() throws ignitionException, boosterExcetpion
		{
			checkignite();
			if(ignitestatus==true)
			{
				System.out.println("Ignition OK......");
			}
			else
			{
				ignitionException ie =new ignitionException("Ignition failed....");
				throw ie;
			}
			
			checkBooster();
			if(boosterstatus==true)
			{
				System.out.println("Booster ok....");
			}
			else
			{
				boosterExcetpion be =new boosterExcetpion("Error in booster");
				throw be;
			}
			
			System.out.println("All Ok....Ready for launch...");
		}
		void launch()
		{
			for(int i=1;i<10;i++)
			{
				double r = Math.random();
				int val = (int)(r*10)+1;
				
				if(val<10)
				{
					gravityException ge = new gravityException("Gravity errorr...");
					throw ge;
				}
			}
			
		}
		
	}
