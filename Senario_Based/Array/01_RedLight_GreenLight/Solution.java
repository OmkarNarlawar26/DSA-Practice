/*

Red Light, Green Light
“You won’t get caught if you hide behind someone.”

Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.

Gi-Hun follows Sang-Woo’s advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height K.
Many players saw this trick and also started hiding behind Ali.

Now, there are N players standing between Gi-Hun and Ali in a straight line, with the i-th player having height H_i.
Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.

Note:
    - Line of sight is a straight line drawn between the topmost point of two objects.
    - Ali is visible to Gi-Hun if nobody between them crosses this line.
    - Even if there are some players with the same height as Gi-Hun and Ali, Ali is still visible.
    - Gi-Hun and Ali have the same height.

Input Format:
    - The first line contains a single integer T, denoting the number of test cases.
    - Each test case begins with two space-separated integers N and K.
    • N is the number of players between Gi-Hun and Ali.
    • K is the height of both Gi-Hun and Ali.
    - The second line of each test case contains N space-separated integers denoting the heights of the players between Gi-Hun and Ali.

Output Format:
    - For each test case, output a single line with the minimum number of players who need to get shot so Ali is visible in Gi-Hun’s line of sight.

Constraints:
    - 1 ≤ T ≤ 10^5
    - 1 ≤ N ≤ 10^5
    - 1 ≤ K ≤ 10^6
    - 1 ≤ H_i ≤ 10^6 for every 1 ≤ i ≤ N
    - The sum of N across all test cases does not exceed 5⋅10^5

Sample Input:
            3
            4 10
            2 13 4 16
            5 8
            9 3 8 8 4
            4 6
            1 2 3 4

Sample Output:
            2
            1
            0

Explanation:
    Test Case 1: Gi-Hun and Ali have height 10. For Ali to be visible, the second person (height 13) and the fourth person (height 16) need to get shot.

    Test Case 2: Gi-Hun and Ali have height 8. For Ali to be visible, the first person (height 9) needs to get shot.

    Test Case 3: Nobody needs to get shot because everyone is shorter than Gi-Hun and Ali.

*/

import java.lang.*;
import java.util.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sobj = new Scanner(System.in);
		
		if(sobj.hasNextInt())
		{
		    int T = sobj.nextInt();
		    
		    while(T-- > 0)
		    {
		        int N = sobj.nextInt(); // total no. of players between
		        int K = sobj.nextInt(); // height of gihun AND ali
		        
		        int Arr[] = new int[N];
		        
		        for(int i = 0; i < N; i++)
		        {
		            Arr[i] = sobj.nextInt();
		        }
		        
		        int Count = 0;
		        
		        for(int i = 0; i < N; i++)
		        {
		            if(Arr[i] > K)
		            {
		                Count++;
		            }
		        }
		        
		        System.out.println(Count);
		    }
		}
        sobj.close();
	}
}
