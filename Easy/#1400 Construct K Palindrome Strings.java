class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k){
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(!charCountMap.containsKey(ch)){
                charCountMap.put(ch, 1);
            }else{
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            }
        }

        int nCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if (entry.getValue() % 2 == 1){
                nCount++;
            }
        }

        return nCount <= k;
    }
}