class NumArray {
    int sums [];
    List<Integer> list = new ArrayList<>();
    public NumArray(int[] nums) {
        this.sums = new int [nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            this.sums[i] = sum;
        }

    }

    public int sumRange(int left, int right) {
        if (left == 0){
            return this.sums[right];
        }else{
            return this.sums[right] - this.sums[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */