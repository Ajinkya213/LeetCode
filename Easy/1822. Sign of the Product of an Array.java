class Solution {
    public int arraySign(int[] nums) {
        int mult = 1;
        for(int i : nums){
            if(i > 0){
                mult *= 1;
            }else if (i < 0){
                mult *= -1;
            }else{
                return 0;
            }
        }
        return mult;
    }
}