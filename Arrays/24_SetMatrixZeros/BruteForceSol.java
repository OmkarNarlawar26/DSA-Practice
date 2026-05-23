
class Solution
{
    // Function to set entire row and column to 0 if an element in the matrix is 0
    public static void setZeros(int[][] matrix)
    {
        // Get number of rows
        int m = matrix.length;

        // Get number of columns
        int n = matrix[0].length;

        // First pass : mark rows and columns
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                // if the cell is zero
                if(matrix[i][j] == 0)
                {
                    // Mark entire row as -1 (except zeros)
                    for(int col = 0; col < n; col++)
                    {
                        if(matrix[i][col] != 0)
                        {
                            matrix[i][col] = -1;
                        }
                    }

                    // Mark entire row as -1 (except zeros)
                    for(int row = 0; row < m; row++)
                    {
                        if(matrix[row][j] != 0)
                        {
                            matrix[row][j] = -1;
                        }
                    }
                }
            }            
        }

        // second pass : replace -1 with 0
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] == -1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

public class BruteForceSol
{
    public static void main(String[] A)
    {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};

        Solution sol = new Solution();

        sol.setZeros(matrix);

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

// Time Complexity: O(m * n * (m + n))
// Space Complexity: O(1)