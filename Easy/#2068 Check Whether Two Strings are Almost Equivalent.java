class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int word1Map [] = new int [26];
        int word2Map [] = new int [26];

        for(char ch : word1.toCharArray()){
            word1Map[ch-'a']++;
        }

        for(char ch : word2.toCharArray()){
            word2Map[ch-'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(Math.abs(word1Map[i] - word2Map[i]) > 3){
                return false;
            }
        }

        return true;
    }
}