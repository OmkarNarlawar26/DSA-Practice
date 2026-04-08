#include <iostream>
using namespace std;

class Solution{
public:
    void reverse(int arr[], int n){

        int start = 0;
        int end = n - 1;

        while(start < end)
        {
            swap(arr[start], arr[end]);
            start++;
            end--;
        }

        // swap(arr[i], arr[n-i-1]);
        // reverse(arr,n);
    }
};


// using recursion
// void reverse(int arr[], int start, int end) {
//     if(start >= end) return;

//     swap(arr[start], arr[end]);
//     reverse(arr, start + 1, end - 1);
// }

// void reverse(int arr[], int n, int i){

        // if(i >= n/2)
        // {
        //     return;
        // }

        // swap(arr[i], arr[n-i-1]);
        // reverse(arr, n, i+1)
//  }


int main() {
    Solution obj;

    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    obj.reverse(arr, n);

    cout << "Array after reverse: ";
    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}