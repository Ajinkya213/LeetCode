class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int replaceElements[] = new int [len];
        //When the arr contains only 1 element
        if(len == 1){
            arr[0] = -1;
            return arr;
        }

        for(int i = 0 ; i < len - 1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i+1; j < len ; j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            replaceElements[i] = max;
        }

        replaceElements[len-1] = -1;

        return replaceElements;
    }
}