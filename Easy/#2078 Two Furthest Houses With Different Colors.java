class Solution {
    public int maxDistance(int[] colors) {
        int len = colors.length;
        int i = 0;
        int j = len -1;

        while(colors[0] == colors[j]){
            j--;
        }

        while(colors[len - 1] == colors[i]){
            i++;
        }

        return Math.max(len - 1 - i, j);
    }
}