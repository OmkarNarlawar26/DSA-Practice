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
		        
		        // Total income = 50 * N
                // Total expenses = 70% of income = 0.7 * 50 * N = 35 * N
                // Profit = 50 * N - 35 * N = 15 * N
                // 50(Income) − 35(Expenses) = 15 coins.
		        
		        System.out.println(15 * N);
		    }
		}
        sobj.close();
	}
}
