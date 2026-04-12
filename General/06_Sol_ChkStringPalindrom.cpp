#include <iostream>
using namespace std;

class Solution{	
	public:		
		bool palindromeCheck(string& s, int i = 0){

            if(i >= s.size() / 2)
            {
                return true;
            }
            else if(s[i] != s[s.size() - i - 1])
            {
                return false;
            }

            return palindromeCheck(s, i + 1);
		}
};

// Time Complexity : O(N/2)

int main() {
    Solution obj;

    string s;
    cout << "Enter string: ";
    cin >> s;

    if(obj.palindromeCheck(s)) {
        cout << "Palindrome" << endl;
    } else {
        cout << "Not Palindrome" << endl;
    }

    return 0;
}