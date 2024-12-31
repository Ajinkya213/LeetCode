class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int len = grid.length;
        int len1 = grid[0].length;
        int ans[] = new int[len1];
        for(int i = 0; i < len1; i++)
        {
            long ma = 0;
            for(int j = 0; j < len;j++)
            {
                long c = grid[j][i];
                if(c < 0)
                    c *= -10;
                if(c > ma)
                    ma = c;
            }
            if(ma > 0)
                ans[i] = (int)(Math.log10(ma));
            ans[i]++;
        }
        return ans;
    }
}