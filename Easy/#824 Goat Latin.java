class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder str = new StringBuilder("");
        int start = 0;
        int end = 0;
        int len = sentence.length() ;
        String additive = "a";
        while(end != len ){
            if(sentence.charAt(end) == ' '){
                str.append(goatWord(sentence.substring(start, end)));
                end++;
                start = end;
                str.append(additive);
                additive += "a";
                str.append(" ");
            }else{
                end++;
            }
        }

        //Handle last word here
        str.append(goatWord(sentence.substring(start, end)));
        str.append(additive);

        return str.toString();
    }

    public static StringBuilder goatWord(String str){
        StringBuilder strf = new StringBuilder(str);
        if("aeiou".contains(strf.substring(0,1).toLowerCase())){
            strf.append("ma");
        }else{
            strf.append(strf.substring(0,1));
            strf.deleteCharAt(0);
            strf.append("ma");
        }

        return strf;
    }
}
