class Solution {
    public int similarPairs(String[] words) {
        int pairs = 0;
        int n = words.length;
        int[] masks = new int[n];
        for (int i = 0; i < n; i++) {
            masks[i] = getMask(words[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (masks[i] == masks[j]) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    private int getMask(String s) {
        int mask = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            mask |= (1 << s.charAt(i) - 'a');
        }

        return mask;
    }}