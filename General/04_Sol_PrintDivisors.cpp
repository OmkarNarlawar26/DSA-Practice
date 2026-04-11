#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> divisors(int n) {

        // Time comples : O(N)
        // vector<int> result;

        // for(int i = 1; i <= n; i++)
        // {
        //     if(n % i == 0)
        //     {
        //         result.push_back(i);
        //     }
        // }
        // return result;

        // Now Optimisation Time Complexity : O(√n)
        vector<int> result;
        
        for(int i = 1; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                result.push_back(i);

                if(i != n / i)  // avoid duplicate
                    result.push_back(n / i);
            }
        }
        
        sort(result.begin(), result.end());

        return result;

    }
};

int main() {
    int n;
    cin >> n;

    Solution obj;
    vector<int> ans = obj.divisors(n);

    for(int x : ans) {
        cout << x << " ";
    }

    return 0;
}