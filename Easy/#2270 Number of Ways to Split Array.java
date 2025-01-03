class Solution {
    public int waysToSplitArray(int[] nums) {
        int len = nums.length;
        long frontSumArray [] = new long [len -1];
        long backSumArray [] = new long [len -1];

        long frontSum = 0;
        for(int i = 0 ; i < len - 1; i++){
            frontSum += nums[i];
            frontSumArray[i] = frontSum;
        }

        long backSum = 0;
        for(int i = len - 1 ; i > 0 ; i--){
            backSum += nums[i];
            backSumArray[i-1] =  backSum;
        }

        int waysToSplitArray = 0;

        for(int i = 0 ; i < len - 1; i++){
            if(frontSumArray[i] >= backSumArray[i]){
                waysToSplitArray++;
            }
        }

        return waysToSplitArray;
    }
}