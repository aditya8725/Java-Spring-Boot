public class Exceptiontest 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		
		int n = 100;
		System.out.println("num : "+n);
		
		int deno = 0;
		System.out.println("deno : "+deno);
		
		System.out.println("Trying to divide" +n +" by "+ deno );
		
		int div = n/deno; //this would throw ecrror in runtime, airthmetic exception
		
		System.out.println("Division: "+div);
		
		System.out.println("End main");
		
		
//	    public static void main(String[] args) 
//	    {
//	        int i=10;
//	        int j=0;
//	        int k=0;
//	        
//	        try {
//	            k=i/j;
//	            
//	        } catch(Exception e)
//	        {
//	            System.out.println(e);
//
//	        }
//
//	        System.out.println(k);
//	    }

	}

}
