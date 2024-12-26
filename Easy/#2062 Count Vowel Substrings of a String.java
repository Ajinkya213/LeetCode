class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int pos = -1; int minDistance = Integer.MAX_VALUE;
        for(int i = 0 ; i < points.length; i++){
            if(x == points[i][0] || y == points[i][1]){
                if(minDistance > Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y)){
                    minDistance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                    pos = i;
                }
            }
        }
        return pos;
    }
}