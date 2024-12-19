class Solution {
    public int[] applyOperations(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0;
        int i = 0;
        for(; i < nums.length - 1; i++)
        {
            if (nums[i] == 0) continue;
            if (nums[i] == nums[i + 1])
            {
                ans[j++] = 2 * nums[i];
                nums[i+ 1] = 0;
            }else
            {
                ans[j++] = nums[i];
            }
        }

        ans[j] = nums[i];

        return ans;
    }
}