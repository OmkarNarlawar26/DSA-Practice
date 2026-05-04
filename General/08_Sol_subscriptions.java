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
		        int N = sobj.nextInt();
		        int X = sobj.nextInt();
		        
		        int Subscriptions = (N + 5) / 6;
		        
		        System.out.println(Subscriptions * X);
		    }
		}
        sobj.close();
	}
}
