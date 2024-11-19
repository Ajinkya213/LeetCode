class Solution {
    public int countCharacters(String[] words, String chars) {
        int [] baseMap = new int [26];

        for(char ch : chars.toCharArray()){
            baseMap[ch - 'a']++;
        }

        int sum = 0;

        for(String word : words){
            int elementMap [] = new int [26];
            for(char ch : word.toCharArray()){
                elementMap[ch - 'a']++;
            }

            boolean notPossible = true;

            for(int i =0; i < baseMap.length; i++){
                if(baseMap[i] < elementMap[i]){
                    notPossible = false;
                    break;
                }
            }

            if(notPossible){
                sum += word.length();
            }
        }
        return sum;
    }
}