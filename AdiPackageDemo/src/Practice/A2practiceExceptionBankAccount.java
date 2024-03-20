package Practice;
import java.util.Random;

public class A2practiceExceptionBankAccount 
{
	public static void main(String[] args) 
	{
		BankAccountt baa = new BankAccountt(10000);
		
		try
		{
			baa.withdraw(100);
			baa.withdraw(700);
			baa.withdraw(-1000);
		}
		catch(InsufficientFundException e )
		{
			System.out.println("Insufficeinet balance : "+e.getMessage());
		}
		catch(InvalidAmountException e)
		{
			System.out.println("Invalid Amount : "+e.getMessage());
		}
	}
}

class InvalidAmountException extends Exception
{

	public InvalidAmountException(String message) 
	{
		super(message);
		// TODO Auto-generated constructor stub
	}	
}

class InsufficientFundException extends Exception
{
	public InsufficientFundException(String message) 
	{
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class BankAccountt
{
	private double balance;

	public BankAccountt(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InvalidAmountException,InsufficientFundException
	{
		if(amount < 0)
		{
			InvalidAmountException iae = new InvalidAmountException("Amount cant be less than zero");
			throw iae;
		}
		
		if(amount>balance)
		{
			InsufficientFundException ife = new InsufficientFundException("Insufficient Fund..");
			throw ife;
		}
		
		balance = balance-amount;
		System.out.println("Withdraw Successfull....."+balance);
	}
	
	
	
	
}