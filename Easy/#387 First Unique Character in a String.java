class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int [] charMap = new int [26];
        for(int i = 0; i < n; i++){
            charMap[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(charMap[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}