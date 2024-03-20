//
//public class UserDefinedExceptiontest {
//
//	public static void main(String[] args) //throws CoolantException 
//	{
//		System.out.println("Begin main");
//			Car myCar = new Car();
//			//Unhandled exception type CoolantException
//			try {
//				myCar.longDrive();
//			} catch (CoolantException | PUCException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			//100
//		System.out.println("End main");
//	}
//
//}
//
//class SpeedLimitExceededException extends RuntimeException {
//	
//}
//class TrafficException extends RuntimeException 
//{
//	public TrafficException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
//class PUCException extends Exception {
//
//	public PUCException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
//class CoolantException extends Exception {
//
//	public CoolantException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
//class Car
//{
//	boolean pucStatus; //false
//	boolean coolantStatus; //false
//	boolean trafficexception;
//	
//	private void checkCoolant() {
//		for(int i=1;i<10;i++) {
//			double val = Math.random()%10; // 0 to 1
//			//System.out.println("val "+val);
//			if(val > 0.50) {
//				//System.out.println("Coolant is sufficient");
//				coolantStatus =true;
//				break;
//			}
//			else if(val<0.75) {
//				//System.out.println("Coolant need to be refilled");
//				coolantStatus = false;
//				break;
//			}
//		}
//	}
//	
//	private void checkPUC() throws PUCException
//	{
//		if(!pucStatus)
//		{
//			throw new PUCException("PUC Date expired");
//		}
//	}
//	//throws mean the below method is susceptible to throw following type of checked excpetion
//	
//	void longDrive() throws CoolantException, PUCException 
//	{
//		System.out.println("Checking the car...");
//		System.out.println("Checking all the docs..");
//		
//		System.out.println("Cheking the engine oil");
//		System.out.println("checking the coolant...");
//		checkCoolant();
//		if(coolantStatus==true) {
//			System.out.println("Coolant is sufficient");
//		}
//		else {
//			CoolantException ex = new CoolantException("Coolant need to be refilled");
//			throw ex;
//		}
//		
//		System.out.println("Checking PUC");
//		checkPUC();
//		if(pucStatus == true)
//		{
//			System.out.println("All good Good...can go on");
//		}
//		else
//		{
//			PUCException px = new PUCException("Action required!!!.... PUC Expired");
//			throw px;
//		}
//		System.out.println("all ok...");
//		for (int i = 1; i <= 30; i++) {
//			System.out.println("Km completed..."+i);
//		}
//		System.out.println("JOURNEY OVER.....");
//	}
//}
//
//
//
////class Rocket,with lauch function example
////2 exception checked ignations and uncheked gravity exception