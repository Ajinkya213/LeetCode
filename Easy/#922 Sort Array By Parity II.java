class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    /* Accidentally created the in - place sorting of the odd and even number
        Funny thing is that it don't prioritise the first element should be even.
        If the first element is odd then next will be even and vice versa
        Nice accidents..
    */

 //Intuition:
// If we encounter an even number the next number should be odd and vice versa
        for(int i = 0; i < nums.length - 1; i++){
            //Either the first num is odd or even;
            if (nums[i] % 2 == 0 ){ //checking if the first value is even if yes |V|
                if(nums[i + 1] % 2 != 1){   //if the next value is even |V|
                    int j = i+1;            // setting 'j'
                    while(j < nums.length && nums[j] % 2 == 0){
                        j++;
                    }
                    int temp = nums[j];
                    nums[j] = nums[i+1];
                    nums[i+1] = temp;
                    i++;
                }
            }else{
                if(nums[i + 1] % 2 != 0){
                    int j = i+1;            // setting 'j'
                    while(j < nums.length && nums[j] % 2 == 1){
                        j++;
                    }
                    int temp = nums[j];
                    nums[j] = nums[i+1];
                    nums[i+1] = temp;
                    i++;
                }
            }
        }
        return nums;
    }
}