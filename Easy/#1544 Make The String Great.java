class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);

        for(int i = 0; i < str.length() - 1;){

            if( str.charAt(i) - 'a' == str.charAt(i+1) - 'A' || str.charAt(i) - 'A' == str.charAt(i+1) - 'a'){
                str.delete(i, i+2);
                i = 0;
            }else{
                i++;
            }
            System.out.println(str.toString());
        }

        return str.toString();
    }
}