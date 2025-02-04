public class Solution {
    public int maxAscendingSum(int[] nums) {

        if (nums.length == 1){
            return nums[0];
        }

        if (nums.length == 0){
            return 0;
        }
        int maxSum = 0;
        int localSum = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= nums[i - 1]) {

                maxSum = Math.max(maxSum, localSum);

                localSum = 0;
            }
            localSum += nums[i];
        }
        return Math.max(maxSum, localSum);
    }
}