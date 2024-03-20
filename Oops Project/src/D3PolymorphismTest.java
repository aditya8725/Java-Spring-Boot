
public class D3PolymorphismTest 
{
	public static void main(String[] args) 
	{
//		Doctor doctorRef = new Doctor();
//		doctorRef.diagnose();
		
//		Doctor doctorRef = new Surgeon();
//		doctorRef.diagnose();
		
//		Doctor doctorRef = new HeartSurgeon();
//		doctorRef.diagnose();
		
		Doctor doctorRef = new Doctor();
		Surgeon surgenRef = new Surgeon();
		HeartSurgeon hearSurgRef = new HeartSurgeon();
		
		//MedicalCamp.medicalCheckup(hearSurgRef);
		OperationTherater.doingopenheartsurgery(hearSurgRef);
		
		
	}
}


class OperationTherater
{
	static void doingopenheartsurgery(HeartSurgeon hs)
	{
		System.out.println("OT is having an open heart surgery");
		hs.diagnose();
	}
}

class MedicalCamp
{
	static void medicalCheckup(Doctor docRef)
	{
		System.out.println("Doing medical Checkup.."+docRef.getClass());
	}
}

class Doctor
{
	void diagnose()
	{
		System.out.println("Doctor : Diagnose()");
	}
}

class Surgeon extends Doctor
{
	void diagnose()
	{
		System.out.println("Surgeon : Diagnose()");
	}
	
	private void cut()
	{
		System.out.println("Cutting");
	}
	
	private void stitching()
	{
		System.out.println("Sticthing...");
	}
	
	void doSurgery()
	{
		cut();
		stitching();
	}
}

class HeartSurgeon extends Surgeon
{
	void diagnose()
	{
		System.out.println("HeatSurgeon : Diagnose()");
	}
}