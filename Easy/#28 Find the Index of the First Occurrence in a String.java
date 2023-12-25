class Solution {
    public int strStr(String haystack, String needle) {
        int haystacklen = haystack.length();
        int needlelen = needle.length();

        if (haystack.equals(needle)){
            return 0;
        }
        for(int i = 0; i <= haystacklen - needlelen; i++){
            if(haystack.substring(i, i+needlelen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}