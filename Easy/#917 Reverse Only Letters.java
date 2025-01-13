class Solution {
    public String reverseOnlyLetters(String s) {
        String lettersOnly = "";
        for (int i = s.length() -1; i >= 0; i--){
            if(Character.isLetter(s.charAt(i))){
                lettersOnly += s.charAt(i);
            }
        }

        String resString = "";
        int index = 0;
        int indexq = 0;
        while(index != s.length()){
            if(Character.isLetter(s.charAt(index))){
                resString+=lettersOnly.charAt(indexq);
                indexq++;
            }else{
                resString+=s.charAt(index);
            }
            index++;
        }
        return resString;
    }
}