class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] nearestCharIndex = new int[s.length()];


        Arrays.fill(nearestCharIndex, Integer.MAX_VALUE);

        int idxforE = 0;
        int prevPos = -10001;
        int indexFollow = 0;


        while(idxforE < s.length()) {
            if (s.charAt(idxforE) == c) {
                for(int i = indexFollow; i <= idxforE; i++) {
                    nearestCharIndex[i] = Math.min(
                            Math.abs(i - prevPos),
                            Math.abs(i - idxforE)
                    );
                }
                prevPos = idxforE;
                indexFollow = idxforE + 1;
            }
            idxforE++;
        }

        for(int i = indexFollow; i < s.length(); i++) {
            nearestCharIndex[i] = Math.abs(i - prevPos);
        }

        return nearestCharIndex;
    }
}