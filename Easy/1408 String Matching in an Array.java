class Solution {
    public List<String> stringMatching(String[] words) {
        List <String> matchedStrings = new ArrayList <>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j){
                    if(words[i].contains(words[j])){
                        if(!matchedStrings.contains(words[j])){
                            matchedStrings.add(words[j]);
                        }
                    }
                }
            }
        }
        return matchedStrings;
    }
}