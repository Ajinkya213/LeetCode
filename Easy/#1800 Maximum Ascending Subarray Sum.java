class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        if (nums.length == 0){
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++){
            int localSum = nums[i];
            for(int j = i; j < nums.length - 1; j++){
                if (nums[j] < nums[j+1]){
                    localSum += nums[j+1];
                }else{
                    break;
                }
            }
            sum = Math.max(localSum, sum);
        }

        return sum;
    }
}