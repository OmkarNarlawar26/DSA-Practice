import java.util.Arrays;

class BubbleSort {
    
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {   //Use two nested loops to iterate over the array
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];  //Swap arr[j+1] with arr[i];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(arr);
    }
}


// Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
// Space Complexity: O(1).