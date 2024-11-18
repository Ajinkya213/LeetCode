class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int replaceElements[] = new int [len];
        //When the arr contains only 1 element
        if(len == 1){
            arr[0] = -1;
            return arr;
        }

        //Find the max and place it accordingly
        int max = Integer.MIN_VALUE;
        for(int i = len - 1; i > 0; i--){
            max = Math.max(max, arr[i]);
            replaceElements[i - 1] = max;
        }

        //Put -1 in the last
        replaceElements[len-1] = -1;

        return replaceElements;
    }
}