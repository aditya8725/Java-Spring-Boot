public class D7BankTestAssign 
{
	public static void main(String[] args) 
	{
		savingAccount sa = new savingAccount(555,"Aditya", 50000);
		sa.showBankAcc();
		sa.withdraw(5000.0);
		sa.showBankAcc();
		
		FixedDepositAmmount fa = new FixedDepositAmmount(122,"SHi",60000,5,10000);
		fa.showDepositeBal();
		
		creditcardamt ca = new creditcardamt(124, "Jwali", 500000, 30000);
		ca.displaycreditcarbal();
		
		CurrentAccount cua = new CurrentAccount(341, "saty", 100000);
		cua.handletranaction();
	
	}
}

class BankAccount
{
	int accno;
	String accholdername;
	double accbal;
	
	BankAccount(int num ,String name, double bal)
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
		System.out.println("------------");
	}
}


class savingAccount extends BankAccount
{
	float ROI = 4;
	
	public savingAccount(int num, String name, double bal) 
	{
		super(num,name,bal);
	}
	
	void showBankAcc()
	{
		super.showBankAcc();
	}
}

class FixedDepositAmmount extends savingAccount
{
	int curyear;
	int maturityyear = 5;
	double FDamt;
	float fdrate = 7.5f;
	
	public FixedDepositAmmount(int num, String name, double bal, int year, double fdamt) 
	{
		super(num, name, bal);
		FDamt = fdamt;
		curyear = year;
	}
	
	void Calculatematurityamt()
	{
		double maturityAmr;
		double interest;
		interest = (fdrate/100) * accbal * (curyear/5);
		maturityAmr = interest+accbal;
		
		if(curyear > maturityyear)
		{
			interest = (fdrate/100)* accbal*(curyear*5);
			maturityAmr = interest + maturityAmr;
		}
		
		System.out.println("Your Account Matured ....");
		System.out.println("Fixed Deposit Amount : "+maturityAmr);
	}
	
	void showDepositeBal()
	{
		System.out.println("Fixed Deposit Account");
		if(curyear<maturityyear)
		{
			System.out.println("Account not matured");
		}
		else
		{
			Calculatematurityamt();
		}
		System.out.println("--------------");
	}
}


class creditcardamt extends BankAccount
{
	double cdlimit = 100000;
	double cashlimit = cdlimit;
	double purchaseamt;
	
	creditcardamt(int num, String name, double bal, double purchaseAmt)
	{
		super(num,name,bal);
		purchaseamt = purchaseAmt;
	}
	
	void calculatelimit()
	{
		System.out.println("Purchased. Account debited");
		cashlimit -= purchaseamt;
	}
	
	void displaycreditcarbal() 
	{
		System.out.println("Credit card account");
		if(purchaseamt>cashlimit)
		{
			System.out.println("You cannot purchase above credit card limit");
		}
		else
		{
			System.out.println("Credit card balance: "+cashlimit);
			System.out.println("Purchase amount : "+purchaseamt);
			calculatelimit();
			System.out.println("Remaninig credit card Balance: "+ cashlimit);
			
		}
		System.out.println("-----------------");
	}		
}

class CurrentAccount
{
	
	int accno;
	String Accountholdername;
	double balancelimit = 100000;
	double withdrawamt;
	
	CurrentAccount(int num,String name,double withdrawAMT)
	{
		accno = num;
		Accountholdername = name;
		withdrawamt = withdrawAMT;
	}
	
	void withdraw()
	{
		System.out.println("Available Current balance: "+balancelimit);
		System.out.println("Withdraw amount.."+withdrawamt);
		balancelimit -= withdrawamt;
		System.out.println("Remaining current account balance : "+balancelimit);
		
	}
	
	void handletranaction()
	{
		System.out.println("Current Account");
		if(withdrawamt>balancelimit)
		{
			System.out.println("Limit exceeded....cannot withdraw");
		}
		else
		{
			withdraw();
		}
	}
}