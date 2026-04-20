#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int j = -1;

        // Find first zero
        for(int i = 0; i < nums.size(); i++)
        {
            if(nums[i] == 0)   // ✅ fixed (was nums[j])
            {
                j = i;
                break;
            }
        }

        if(j == -1)
        {
            return;
        }

        // Swap non-zero elements
        for(int i = j + 1; i < nums.size(); i++)
        {
            if(nums[i] != 0)
            {
                swap(nums[i], nums[j]);
                j++;
            }
        }
    }
};

// Time Complexity: O(n)
// Space Complexity: O(1)

int main() {
    int n;

    cout << "Enter number of elements: ";
    cin >> n;

    vector<int> nums(n);

    cout << "Enter elements: ";
    for(int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    Solution obj;
    obj.moveZeroes(nums);

    cout << "Array after moving zeroes: ";
    for(int i = 0; i < n; i++) {
        cout << nums[i] << " ";
    }

    cout << endl;

    return 0;
}