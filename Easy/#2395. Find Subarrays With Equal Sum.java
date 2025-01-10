class Solution {
    public boolean findSubarrays(int[] nums) {
        int len = nums.length ;
        Set <Integer> list = new HashSet<>();

        for(int i = 0; i < len - 1; i++){
            if(!list.contains(nums[i]+ nums[i+1])){
                list.add(nums[i]+ nums[i+1]);
            }else{
                return true;
            }
        }
        return false;
    }
}