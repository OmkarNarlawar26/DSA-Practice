#include <iostream>
#include <cmath>
using namespace std;

class Solution {
public:
    bool isArmstrong(int n) {
        int temp = n;

        int digit = 0;
        int Count = 0;
        int Sum = 0;

        while(temp != 0)
        {
            digit = temp % 10;
            Count++;
            temp = temp / 10;
        }

        temp = n;

        while(temp != 0)
        {
            digit = temp % 10;
            Sum = Sum + pow(digit,Count);
            temp = temp / 10;
        }

        if(n == Sum)
        {
            return true;
        }
        return false;
    }
};

int main() {
    int n;
    cout << "Enter number: ";
    cin >> n;

    Solution obj;

    if(obj.isArmstrong(n)) {
        cout << "Armstrong Number";
    } else {
        cout << "Not an Armstrong Number";
    }

    return 0;
}