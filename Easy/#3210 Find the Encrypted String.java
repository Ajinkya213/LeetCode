class Solution {
    public String getEncryptedString(String s, int k) {
        int len = s.length();
        StringBuilder encryptString = new StringBuilder();
        for(int i = 0; i < len; i++){
            encryptString.append(s.charAt((i+k)%len));
        }

        return encryptString.toString();
    }
}