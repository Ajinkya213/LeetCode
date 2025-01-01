class Solution {
    public int maxScore(String s) {
        int max  = 0;
        int len = s.length();
        for(int i = 1 ; i < len; i++){
            int localMax = 0;
            localMax += countZeros(s.substring(0, i ));
            localMax += countOnes(s.substring(i, len));

            max = Math.max(localMax, max);
        }
        return max;
    }

    public static int countZeros(String str){
        int count  = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                count++;
            }
        }
        return count;
    }

    public static int countOnes(String str){
        int count  = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}