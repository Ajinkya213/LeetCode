class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int largeLen = -1;
        int len = s.length();
        int i = 0;
        while (i < len - 1){
            int j = i + 1;
            int prevlen = 0;
            while(j < len){
                if(s.charAt(i) == s.charAt(j)){
                    largeLen = Math.max(largeLen, j - i);
                }
                j++;
            }
            i++;
        }
        return largeLen == -1 ? -1 : largeLen-1;
    }
}