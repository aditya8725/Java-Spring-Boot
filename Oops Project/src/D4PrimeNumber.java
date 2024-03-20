import java.util.*;

public class D4PrimeNumber {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(isPrime(n))
			System.out.println("Prime");
		else
			System.out.println("No Not prime");
	}


    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
        {
            return false; 
        }
        
        for (int i = 2; i < n; i++) 
        {
        	if (n % i == 0) 
        	{
                return false; 
        	}
        }
        return true; 
    }
}