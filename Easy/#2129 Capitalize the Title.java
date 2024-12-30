class Solution {
    public String capitalizeTitle(String title) {
        String tokens [] = title.split(" ");
        StringBuilder captilisedString = new StringBuilder();
        for(String token : tokens){
            int len = token.length();

            //System.out.println(token);
            if(len <= 2){
                token = token.toLowerCase();
            }else{
                token = token.substring(0,1).toUpperCase()+token.substring(1,len).toLowerCase();
            }

            System.out.println(token);

            captilisedString.append(token+" ");
        }
        return captilisedString.toString().trim();
    }
}