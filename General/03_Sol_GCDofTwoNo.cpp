#include <iostream>
using namespace std;

class Solution {
public:
    int GCD(int n1,int n2) {
        // int gcd = 1;
        
        // for (int i = 1; i <= min(n1,n2); i++)
        // {
        //     if(n1%i == 0 && n2%i == 0)
        //     {
        //         gcd = i;
        //     }
        // }
        // return gcd;

        if (n2 == 0)
        return n1;
        return GCD(n2, n1 % n2);
    }
};

int main() {
    int n1, n2;
    cin >> n1 >> n2;

    Solution obj;
    int result = obj.GCD(n1, n2);

    cout << result;

    return 0;
}