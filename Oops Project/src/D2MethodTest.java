//// 4 types of functions
//public class D2MethodTest 
//{
//	public static void main(String args[])
//	{
//		BankAccount1 bankaccountObjRef = new BankAccount1();
//		bankaccountObjRef.withdraw();
//		bankaccountObjRef.withdraw(5000.0f);
//		double remBalance = bankaccountObjRef.withdraw(4000.0);
//		System.out.println("Rem Balance : " + remBalance);
//		
//		bankaccountObjRef.withdraw(2000.0f);
//		double myBal = bankaccountObjRef.whatIsMyBalance();
//		System.out.println("MyBalance: "+myBal);
//	}
//}
//
//class BankAccount1
//{
//	
//	double currentBalance = 50000;
//	//1. function without argument and without return value.
//	void withdraw()
//	{
//		System.out.println("1. withdrawing....");
//	}
//	
//	//2. Function with argument and without return value.
//	void withdraw(float amountTOWithdraw)
//	{
//		System.out.println("2. withdrawing...."+amountTOWithdraw);
//		currentBalance = currentBalance - amountTOWithdraw;
//	}
//	
//	//3. function with argument and with return value.
//	double withdraw(double amountTOWithdraw)
//	{
//		System.out.println("3. withdrawing...."+amountTOWithdraw);
//		currentBalance = currentBalance - amountTOWithdraw;
//		return currentBalance;
//	}
//	
//	//4. function without argument but with return value.
//	double whatIsMyBalance()
//	{
//		System.out.println("4.Finding your balance..");
//		return currentBalance;
//	}
//}
//
//
//
////Associattion principle in java
//
////composition
//// aggregation
//
////is a relation , has a, uses a and produces