class Solution {
    public int surfaceArea(int[][] grid) {
        int res = 0;
        for (int i = 0;i < grid.length;i++)
            for (int j = 0;j < grid[0].length;j++)
            {

                if (grid[i][j] != 0)
                    res += 2;

                if (i == 0)
                    res += grid[i][j];

                if (j == 0)
                    res += grid[i][j];

                if (i == grid.length - 1)
                    res += grid[i][j];

                if (j == grid[0].length - 1)
                    res += grid[i][j];

                if (i < grid.length - 1)
                    res += Math.abs(grid[i][j] - grid[i + 1][j]);

                if (j < grid[0].length - 1)
                    res += Math.abs(grid[i][j] - grid[i][j + 1]);
            }
        return res;
    }
}