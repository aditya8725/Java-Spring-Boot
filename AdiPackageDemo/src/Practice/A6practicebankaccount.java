package Practice;

public class A6practicebankaccount 
{
	public static void main(String[] args) 
	{
		bankAcc ba = new bankAcc("12345",10000);

			try {
				ba.withdraw(100);
				ba.withdraw(300);
//				ba.withdraw(-10);
				ba.deposit(176);
				
			} catch (invalidexception e) {
				System.out.println("Invalid error: "+e.getMessage());
			} catch (InsufiiceientBal e) {
				System.out.println("Insufficent balance: "+e.getMessage());
			}
	}
}


class InsufiiceientBal extends Exception
{

	public InsufiiceientBal(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class invalidexception extends Exception
{

	public invalidexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
class bankAcc
{
	private String accoutno;
	private double Balance;

		public bankAcc(String accoutno, double initialbal) 
		{
		super();
		this.accoutno = accoutno;
		this.Balance = initialbal;
	}

		
	public void deposit(double amount)throws invalidexception
	{
		if(amount<0)
		{
			throw new invalidexception("Amount to be grater than zero");
		}
		Balance = Balance+amount;
		System.out.println("Deposited: "+Balance);
		
	}
	public void withdraw(double amount) throws invalidexception,InsufiiceientBal
	{
		if(amount<0)
		{
			invalidexception ie = new invalidexception("Cannot be less than zero");
			throw ie;
		}
		if(amount>Balance)
		{
			InsufiiceientBal is = new InsufiiceientBal("Insufficenet balance");
			throw is;
		}
		Balance = Balance-amount;
		System.out.println("Withdraw successfull: "+Balance);
	}
	
}
