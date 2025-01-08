class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if( i == j){
                    if(grid[i][j] > 0){
                        continue;
                    }else{
                        return false;
                    }
                }else if( i + j == grid[i].length - 1){
                    if(grid[i][j] > 0){
                        continue;
                    }else{
                        return false;
                    }
                }else if(grid[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}