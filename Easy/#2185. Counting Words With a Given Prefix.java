class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefixCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length() && words[i].startsWith(pref)) {
                prefixCount++;
            }
        }
        return prefixCount;
    }
}