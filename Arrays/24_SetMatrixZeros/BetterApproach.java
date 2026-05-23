
class Solution
{
    // Function to set entire row and column to 0 if an element in the matrix is 0
    public static void setZeroes(int[][] matrix)
    {
        // Get number of rows
        int m = matrix.length;

        // Get number of columns
        int n = matrix[0].length;

        // create row matrix array
        boolean[] row = new boolean[m];

        // create column matrix array
        boolean[] col = new boolean[n];

        // First pass: mark rows and columns that need to be zeroed
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                // If element is zero, mark its row and cloumn
                if(matrix[i][j] == 0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Second Pass : set cells to zero based on markers
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // If the row or column is marked, set cell to zero
                if (row[i] || col[j])
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

public class BetterApproach
{
     public static void main(String[] A)
     {
        // Create the matrix
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
        // Create Solution object
        Solution sol = new Solution();

        // Call function
        sol.setZeroes(matrix);
        
        // Print the updated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }    
}

// Time Complexity: O(m × n)
// Space Complexity: O(m + n)