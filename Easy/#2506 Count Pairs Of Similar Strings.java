class Solution {
    public int similarPairs(String[] words) {
        //1. Santize the strings in the 'words' array
        List <String> list = new ArrayList<>();

        for(String word : words){
            String str = "";
            for(int i = 0 ; i < word.length(); i++){
                if(!str.contains(word.substring(i, i+1))){
                    str+=word.substring(i, i+1);
                }
            }
            char tokens [] = str.toCharArray();
            Arrays.sort(tokens);
            str = String.valueOf(tokens);

            list.add(str);
        }

        int count = 0;
        for(int i = 0 ; i < list.size() - 1; i++){
            for(int j = i + 1; j  < list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
        }

        return count;
    }
}