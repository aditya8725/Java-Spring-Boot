
//public class D1Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World to STS");
//	}
//
//}
//OBJECT METHODS ---> W W W N NA EQ HC TOSTRING FINALIZE CLONE GETCLASS



	public class Test {
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		System.out.println("----------------");
		Father f = new Father();
		System.out.println("----------------");
		Child c = new Child() ;
		
	}
}
class GrandFather {
	GrandFather(int i, int j, int k) {
		System.out.println("GrandFather()....");
	}
	GrandFather() { }
}
class Father extends GrandFather {
	Father() {
		super(10,20,30);
		System.out.println("Father()....");
	}
	
}
class Child extends Father {
	Child() {
	
		System.out.println("Child()....");
		//Constructor call must be the first statement in a constructor
	}
	
}
