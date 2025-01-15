class Solution {
    public int minimumSum(int[] nums) {
        int count = Integer.MAX_VALUE;
        for(int i = 2; i < nums.length; i++) {
            for(int j = 1; j < i; j++){
                for(int k = 0; k < j; k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        count = Math.min(count, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return count == Integer.MAX_VALUE ? -1 : count;
    }
}