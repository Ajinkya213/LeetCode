class Solution {
    public int numSpecial(int[][] mat) {
        int specialPositions = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    //We need to check on all the side top, bottom, left, right

                    // check left
                    boolean leftFound = false;
                    for(int k = j+1; k < mat[i].length; k++){
                        if(mat[i][k] == 1){
                            leftFound = true;
                            break;
                        }
                    }

                    //check right
                    boolean rightFound = false;
                    for(int k = j-1; k >= 0; k--){
                        if(mat[i][k] == 1){
                            rightFound = true;
                            break;
                        }
                    }


                    // check top
                    boolean topFound = false;
                    for(int k = i - 1; k >=0; k--){
                        if(mat[k][j] == 1){
                            topFound = true;
                            break;
                        }
                    }

                    // check bottom
                    boolean bottomFound = false;
                    for(int k = i + 1; k < mat.length ; k++){
                        if(mat[k][j] == 1){
                            bottomFound = true;
                            break;
                        }
                    }


                    //Checking
                    if(!topFound && !bottomFound && !rightFound && !leftFound){
                        specialPositions++;
                    }
                }
            }
        }
        return specialPositions;
    }
}