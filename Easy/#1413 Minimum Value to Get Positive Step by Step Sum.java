class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;
        while(true){
            boolean foundNegative = false;
            int sum = 0;
            for (int i = 0 ;i < nums.length; i++){
                sum += nums[i];
                if(startValue + sum < 1){
                    foundNegative = true;
                }
            }
            if(!foundNegative){
                break;
            }else{
                startValue++;
            }

        }
        return startValue;
    }
}