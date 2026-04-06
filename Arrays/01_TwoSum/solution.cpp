// Day 1 - Two Sum

#include <bits/stdc++.h>
using namespace std;

// Approach: Hash Map

// Time Complexity: O(N)
// Space Complexity: O(N)

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> mp;

    for(int i = 0; i < nums.size(); i++) {
        int complement = target - nums[i];

        if(mp.find(complement) != mp.end()) {
            return {mp[complement], i};
        }

        mp[nums[i]] = i;
    }
    return {};
}