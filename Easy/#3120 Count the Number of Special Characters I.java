class Solution {
    public int numberOfSpecialChars(String word) {
        int [] wordSmMap = new int [26];
        int [] wordCaMap = new int [26];

        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(index <= -7 && index >= -32){
                wordCaMap[Math.abs(index + 32)]++;
            }else{
                wordSmMap[index]++;
            }
        }

        int count  = 0;
        for(int i = 0; i < 26; i++){
            if(wordCaMap[i] > 0 && wordSmMap[i] > 0){
                count++;
            }
        }

        return count;
    }
}