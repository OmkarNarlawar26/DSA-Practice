#include <iostream>
using namespace std;

class Solution {
public:
    int fib(int n) {
        if(n <= 1)
        {
            return n;
        }

        int Last = fib(n - 1);
        int sLast = fib(n - 2);

        return Last + sLast;
    }
};

int main() {
    Solution obj;

    int n;
    cout << "Enter value of n: ";
    cin >> n;

    int result = obj.fib(n);

    cout << "Fibonacci of " << n << " is: " << result << endl;

    return 0;
}