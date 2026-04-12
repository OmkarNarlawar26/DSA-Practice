#include <iostream>
using namespace std;

class Solution {
public:
    bool isPrime(int n) {

        int Count = 0;

        if(n <= 1) return false;
        
        // time complexity : O(N)
        // for(int i = 1; i <= n; i++)
        // {
        //     if(n % i == 0)
        //     {
        //         Count++;
        //     }
        // }

        // time complexity : O(sqrt(N))
        for(int i = 1; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                Count++;

                if(n/i != i)
                {
                    Count++;
                }
            }

            
        }

        if(Count == 2)
        {
            return true;
        }
        return false;
    }
};

int main() {
    Solution obj;
    
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if(obj.isPrime(n)) {
        cout << n << " is Prime" << endl;
    } else {
        cout << n << " is Not Prime" << endl;
    }

    return 0;
}