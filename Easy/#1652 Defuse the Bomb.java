class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] decryptedCode = new int[len];

        // Return array of zeros if k is 0
        if (k == 0) {
            return decryptedCode;
        }

        for (int i = 0; i < len; i++) {
            int sum = 0;
            if (k > 0) {
                int fIndex = i + 1;
                int count = 1;
                while (count <= k) {
                    if (fIndex >= len) {
                        fIndex = 0;
                    }
                    sum += code[fIndex];
                    fIndex++;
                    count++;
                }
                decryptedCode[i] = sum;
            } else {  // k < 0
                int fIndex = i - 1;
                int count = 1;
                while (count <= Math.abs(k)) {
                    if (fIndex < 0) {
                        fIndex = len - 1;
                    }
                    sum += code[fIndex];
                    fIndex--;
                    count++;
                }
                decryptedCode[i] = sum;
            }
        }
        return decryptedCode;
    }
}