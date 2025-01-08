class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        //top left to bottom right diagonal
        for(int i = 0; i < len; i++){
            if (grid[i][i] == 0){
                return false;
            }else{
                if(!(grid.length%2!=0 && ((grid.length/2))==i)) grid[i][i]=0;
            }
        }

        //top right to bottom left diagonal
        for(int i = 0; i < len; i++){
            if (grid[i][len - 1 - i] == 0){
                return false;
            }else{
                grid[i][len - 1 - i] = 0;
            }
        }

        for(int[] row : grid){
            for(int element : row){
                if(element !=0) return false;
            }
        }
        return true;
    }
}