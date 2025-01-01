class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totalApples = 0;
        int usedBoxes = 0;

        // Taking the total of the apples
        for(int eachApple : apple){
            totalApples += eachApple;
        }


        for(int index = capacity.length - 1; index >= 0; index--){
            totalApples =  totalApples - capacity[index];
            usedBoxes++;
            if (totalApples <= 0){
                break;
            }
        }

        return usedBoxes;
    }
}