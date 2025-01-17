class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int wordMap [] = new int [26];

        for(char ch : word1.toCharArray()){
            wordMap[ch-'a']++;
        }

        for(char ch : word2.toCharArray()){
            wordMap[ch-'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(Math.abs(wordMap[i]) > 3){
                return false;
            }
        }

        return true;
    }
}