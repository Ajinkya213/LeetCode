class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int len = grid.length;
        int maxColWidth [] = new int [grid[0].length];
        int k = 0;
        for(int i = 0; i < grid[0].length; i++){
            int max = -1;
            for(int j = 0; j < len ; j++){
                String s = grid[j][i]+" ";
                max = Math.max(max , s.length() - 1);
            }
            maxColWidth[i] = max;
        }
        return maxColWidth;
    }
}