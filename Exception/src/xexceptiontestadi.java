
public class xexceptiontestadi 
{

    public static void main(String[] args) 
    {
        int i=10;
        int j=0;
        int k=0;
        int a[] = new int[4];
        
        try 
        {
            k=i/j;
            
            System.out.println(a[5]);
            
            
        } 
        catch(ArithmeticException e)
        {
            System.out.println(e);

        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Array out of bound" + e);
        }
    }


}
