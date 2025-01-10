class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefixCount = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() >= pref.length() && words[i].substring(0, pref.length()).equals(pref)) {
                prefixCount++;
            }
        }
        return prefixCount;
    }
}