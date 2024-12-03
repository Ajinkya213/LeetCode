class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = -1;
        String tokens [] = sentence.split(" ");
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].startsWith(searchWord)){
                index = i;
                index++;
                break;
            }
        }
        return index;
    }
}