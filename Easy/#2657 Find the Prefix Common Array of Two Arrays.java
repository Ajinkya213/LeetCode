class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        Set<Integer> seen = new HashSet<>();
        int commonCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (seen.contains(A[i])) {
                commonCount++;
            } else {
                seen.add(A[i]);
            }

            if (seen.contains(B[i])) {
                commonCount++;
            } else {
                seen.add(B[i]);
            }

            ans[i] = commonCount;
        }

        return ans;
    }
}