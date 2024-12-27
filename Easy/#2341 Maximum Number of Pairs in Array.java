class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i)+1);
            }
        }
        System.out.println(map);
        int pairsCount = 0;
        int remainCount = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 == 0){
                pairsCount += entry.getValue() / 2;
            }else{
                if(entry.getValue() == 1){
                    remainCount++;
                }else{
                    pairsCount += entry.getValue() / 2;
                    remainCount++;
                }
            }
        }



        return new int []{pairsCount, remainCount};
    }
}