
public class demo 
{
	public static void main(String[] args) 
	{
//		Car petrolCar = new PetrolCar();
//		PetrolCar.openTheDoor();
		CngCar car = new CngCar();
		car.fun();
		
		CngAuto x = new CngAuto();
		x.fun2();
	}
}
class Car{
	int n = 10;
	static void openTheDoor() {
		System.out.println("Door is opened.");
	}
}
class ElectricCar extends Car{
	
}
class CngCar extends Car{
//	CngCar(){
//		super.openTheDoor();
//	}
//	static int n = 10;
	public void fun(){
		openTheDoor();
	}
//	System.out.println(fun());
}
class CngAuto extends CngCar{
	CngCar c = new CngCar();

	public void fun2() {
		fun();
//		System.out.println("");
	}
//	System.out.println()
}
class PetrolCar extends Car{
//	Car c = new Car();
//	Car.openTheDoor();
}