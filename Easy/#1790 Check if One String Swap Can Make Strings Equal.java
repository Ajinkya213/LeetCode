class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int firstIndexDiff = 0;
        int secondIndexDiff = 0;
        int threshold = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                threshold++;
                if (threshold > 2) return false;
                else if (threshold == 1) {
                    firstIndexDiff = i;
                } else {
                    secondIndexDiff = i;
                }
            }
        }
        return (
                s1.charAt(firstIndexDiff) == s2.charAt(secondIndexDiff) &&
                        s1.charAt(secondIndexDiff) == s2.charAt(firstIndexDiff)
        );
    }
}