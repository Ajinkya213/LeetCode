class NumArray {
    int numsArray [];
    public NumArray(int[] nums) {
        this.numsArray = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int index = left; index <= right; index++){
            sum += numsArray[index];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */