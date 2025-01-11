class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k){
            return false;
        }

        int charMap [] = new int [26];

        for(char ch : s.toCharArray()){
            charMap[ch - 'a']++;
        }

        int nCount = 0;
        for(int freq : charMap){
            if(freq % 2 == 1){
                nCount++;
            }
        }

        return nCount <= k;
    }
}