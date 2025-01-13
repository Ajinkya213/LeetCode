class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder srev = new StringBuilder(s);
        srev.reverse();
        String rev = srev.toString();
        for(int i = 0; i < s.length() -1 ; i++){
            if(rev.contains(s.substring(i, i+2))){
                return true;
            }
        }
        return false;
    }
}