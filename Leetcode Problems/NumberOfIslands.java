public class NumberOfIslands {

    // --- The Core Logic ---
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++; // Found a new island!
                    dfs(grid, i, j); // "Sink" the rest of it
                }
            }
        }
        return numIslands;
    }

    // --- The DFS Helper Method ---
    private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // Mark as visited (sink it)

        dfs(grid, i + 1, j); // Down
        dfs(grid, i - 1, j); // Up
        dfs(grid, i, j + 1); // Right
        dfs(grid, i, j - 1); // Left
    }

    // --- Main Method for VS Code Testing ---
    public static void main(String[] args) {
        NumberOfIslands solution = new NumberOfIslands();

        // Test Case 1
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        System.out.println("--- Example 1 ---");
        System.out.println("Output: " + solution.numIslands(grid1)); // Expected: 1
        System.out.println();

        // Test Case 2
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("--- Example 2 ---");
        System.out.println("Output: " + solution.numIslands(grid2)); // Expected: 3
    }
}