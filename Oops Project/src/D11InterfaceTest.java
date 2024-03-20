public class D11InterfaceTest 
{
	public static void main(String[] args) 
	{
		BankAccountt b1 = new BankAccountt(101, "Aditya", 500000);
		BankAccountt b2 = new BankAccountt(202, "Akash", 80000);
		
		b1.withdraw(7000);
		b2.deposit(7000);
		
		
		//Fundtransfer.transfer(b1, b2, 7000);
		
		b1.showBankAcc();
		b2.showBankAcc();
	}
}

interface withdrawing
{
	void withdrawing();
}

class Fundtransfer
{
	static void transfer(BankAccountt source, BankAccountt target,float amountToTransfer)
	{
		System.out.println("--Transfer in Progress---");
		source.deposit(amountToTransfer);
		target.withdraw(amountToTransfer);
		System.out.println("--- Funds Transferred ----");
	}
}


class BankAccountt
{
	int accno;
	String accholdername;
	double accbal;
	
	BankAccountt(int num ,String name, double bal)
	{
		System.out.println("Bank Account Constructor....");
		accno = num;
		accholdername = name;
		accbal = bal;
	}
	
	void deposit(double amt)
	{
		System.out.println("Depositing....."+amt);
		accbal = accbal+amt;
	}
	
	void withdraw(double amt)
	{
		System.out.println("Withdraw....."+amt);
	}
	
	void showBankAcc()
	{
		System.out.println("------------");
		System.out.println("Displaying account : ");
		System.out.println("Account Hashcode : "+ hashCode());
		System.out.println("Account Name : " + accholdername);
		System.out.println("Account Number : "+accno);
		System.out.println("ACBAL  : "+accbal);
		System.out.println("------------");
	}
}
