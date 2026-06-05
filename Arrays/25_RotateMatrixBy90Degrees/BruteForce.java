
class Solution
{
    public int[][] rotatedClockwise(int[][] matrix)
    {
        // Get the size of square matrix
        int n = matrix.length;

        // Create a new matrix of same size to store rotates result
        int[][] rotated = new int[n][n];

        // Traverse each element of original matrix
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                // Place the element at its new rotates position
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        // Return the rotated matrix
        return rotated;
    }
}

class BruteForce
{
    public static void main(String[] A)
    {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Solution sobj = new Solution();
        
        int[][] rotated = sobj.rotatedClockwise(mat);

        //print rotated matrix
        for(int[] row : rotated)
        {
            for(int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

// Time Complexity : O(N²)
// Space Complexity: O(N²)