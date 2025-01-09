class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int countPrefixSuffixPairs = 0;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                if (words[i].length() <= words[j].length()){
                    if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                        countPrefixSuffixPairs++;
                    }
                }
            }
        }
        return countPrefixSuffixPairs;
    }
}