class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101]; // 0~100
        for(int i = 0; i< nums.length; i++) {
            count[nums[i]]++;
        }
        int pair = 0;
        int leftover = 0;
        for(int i: count) {
            if(i == 0) {
                continue;
            }
            pair += i/2;
            leftover += i%2;
        }
        return new int[] {pair,leftover};
    }
}