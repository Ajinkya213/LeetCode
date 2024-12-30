class Solution {
    public String capitalizeTitle(String title) {
        String tokens [] = title.split(" ");
        String captilisedString = "";
        for(String token : tokens){
            int len = token.length();

            //System.out.println(token);
            if(len <= 2){
                token = token.toLowerCase();
            }else{
                token = token.substring(0,1).toUpperCase()+token.substring(1,len).toLowerCase();
            }
            captilisedString+= token+" ";
        }
        return captilisedString.trim();
    }
}