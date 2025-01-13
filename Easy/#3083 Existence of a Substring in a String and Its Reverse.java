class Solution {
    public boolean isSubstringPresent(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }

        Set<String> set = new HashSet<>();

        for(int i =0; i < s.length() - 1; i++){
            System.out.println(s.substring(i, i+2));
            if(!set.contains(s.substring(i, i+2))){
                set.add(s.substring(i, i+2));
            }
        }

        for(int i = 0; i < s.length() - 1; i++){
            if(set.contains(rev.substring(s.length ()- i - 2, s.length() - i))){
                return true;
            }
        }

        return false;
    }
}