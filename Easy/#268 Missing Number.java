class Solution {
    public int missingNumber(int[] nums) {
        //Finding the sum
        int n = nums.length;
        int containSum = (n * (n+1))/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return containSum - actualSum;
    }
}