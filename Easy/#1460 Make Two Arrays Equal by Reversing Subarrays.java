class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] elementsCount = new int[1001];
        int uniqueCount = 0;

        for(int i=0; i<target.length; i++){
            if(elementsCount[target[i]]++ == 0){
                uniqueCount++;
            }
            if(elementsCount[arr[i]]-- == 1){
                uniqueCount--;
            }
        }
        return uniqueCount == 0;
    }
}