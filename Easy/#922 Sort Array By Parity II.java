class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        /*
        * Completed the challenge by doing the in place sorting
        * Time complexity O(n^2);
        * Space complexity O(1);
        * Time taken 6 ms.
        * Need to find a better way.
        * */
        for(int i = 0 ; i < nums.length - 1; i++){
            int index =  i % 2;
            if(nums[i] % 2 != index){
                int j = i+1;
                while(j < nums.length){
                    if(nums[j] % 2 == index){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    j++;
                }
            }
        }
        return nums;
    }
}