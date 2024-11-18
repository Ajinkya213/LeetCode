class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int ans [] = new int [n];
        for(int i = 0 ; i < nums.size(); i++){
            int value = 0;
            boolean found = false;
            for(int j = value; j < nums.get(i); j++){
                if((j | (j+1)) == nums.get(i)){
                    found = true;
                    ans[i] = j;
                    break;
                }
            }
            if(!found){
                ans[i] = -1;
            }
        }
        return ans;
    }
}