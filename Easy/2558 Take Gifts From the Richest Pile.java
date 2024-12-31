class Solution {
    public long pickGifts(int[] gifts, int k) {
        //Arrays.sort(gifts);
        long sum = 0;
        for(int i = 0; i < k; i++){
            int index = 0;
            int max = -1;
            int maxIndex = -1;

            //Finding the max
            while(index < gifts.length){
                if(gifts[index] > max){
                    max = gifts[index];
                    maxIndex = index;
                }
                index++;
            }
            //setting the squareroot
            int squareRoot = (int) Math.sqrt(max);
            gifts[maxIndex] = squareRoot;

        }

        for(int i : gifts){
            sum += i;
        }
        return sum;
    }
}