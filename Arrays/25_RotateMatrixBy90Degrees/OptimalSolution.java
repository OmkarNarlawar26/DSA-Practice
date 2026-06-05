
class Solution
{
    public void rotateClockwise(int[][] matrix)
    {
        int n = matrix.length;

        // Step 1 : Transpose the matrix
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                // Swap element at (i,j) with (j,i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2 : Reverse each row
        {
            for(int i = 0; i < n; i++)
            {
                int left = 0, right = n-1;

                // Swap element from both ends moving toward center
                while(left < right)
                {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }
        } 
    }
}

class OptimalSolution
{
    public static void main(String[] A)
    {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Solution sobj = new Solution();

        sobj.rotateClockwise(matrix);

        //print rotated matrix
        for(int[] row : matrix)
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
// Space Complexity: O(1)