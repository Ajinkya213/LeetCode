class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] prefixCommonArray = new int [A.length];
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i < A.length; i++){
            set.add(A[i]);
            int count = 0;
            for(int j = 0; j <=i; j++){
                if(set.contains(B[j])){
                    count++;
                }
            }
            prefixCommonArray[i] = count;
        }
        return prefixCommonArray;
    }
}