class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;
        // 'K' times to move
        while(k != 0){
            int temp = grid[m - 1][n - 1];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    int localTemp = grid[i][j];
                    grid[i][j] = temp;
                    temp = localTemp;
                }
            }
            k--;
        }

        List <List<Integer>> shiftedGrid = new ArrayList <List<Integer>>();

        for(int i = 0; i < m; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                list.add(grid[i][j]);
            }
            shiftedGrid.add(list);
        }

        return shiftedGrid;
    }
}