public class Exceptiontest2
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		
		try
		{

			int n = 100;
			System.out.println("num : "+n);
			
			int deno = 0;
			System.out.println("deno : "+deno);
			
			System.out.println("Trying to divide" +n +" by "+ deno );
			
			int div = n/deno; //this would throw ecrror in runtime, airthmetic exception
			
			System.out.println("Division: "+div);
		}
		catch(ArithmeticException aeexref)
		{
			System.out.println("Cannot divide by zero"+ aeexref);
			System.out.println("Some message: "+ aeexref.getMessage());
		}

		
		// types of exceptions
		
//		catch(RuntimeException re)
//		{
//			
//		}
//		
//		catch(Exception e)
//		{
//			
//		}
//		
//		catch(Throwable e)
//		{
//			
//		}
		System.out.println("End main");
	}

}
