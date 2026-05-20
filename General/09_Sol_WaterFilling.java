import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sobj = new Scanner(System.in);
	    
	    if(sobj.hasNextInt())
	    {
	        int T = sobj.nextInt();
	        
	        while(T-- > 0)
	        {
	            int B1 = sobj.nextInt();
	            int B2 = sobj.nextInt();
	            int B3 = sobj.nextInt();
	            
	            // If sum is <=1, it means at least 2 bottles are 0 (empty)
	            if((B1 + B2 + B3) <= 1)
	            {
	                System.out.println("Water filling time");
	            }
	            else
	            {
	                System.out.println("Not now");
	                
	            }
	        }
	    }
	    
	    sobj.close();
	}
}
