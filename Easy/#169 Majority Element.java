class Solution {
    public int majorityElement(int[] nums) {

        // All the additions will be stored in nums[0];
        int count = 1;
        int majorElement =nums[0];
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                count++;
                majorElement = nums[i];
            }else if (majorElement == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return majorElement;
    }
}