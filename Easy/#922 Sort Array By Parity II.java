class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPtr = 0;
        int oddPtr = 1;
        int n = nums.length;

        /*
        Time complexity = O(n);
        Space complexity = O(1);
        Best solution.
        */
        while (evenPtr < n && oddPtr < n) {
            while (oddPtr < n && nums[oddPtr] % 2 == 1) {
                oddPtr += 2;
            }

            while (evenPtr < n && nums[evenPtr] % 2 == 0) {
                evenPtr += 2;
            }

            if (evenPtr < n && oddPtr < n) {
                int temp = nums[evenPtr];
                nums[evenPtr] = nums[oddPtr];
                nums[oddPtr] = temp;
            }
        }

        return nums;
    }
}