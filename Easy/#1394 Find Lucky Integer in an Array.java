class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }

        int max = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue() && max < entry.getKey()){
                max = entry.getKey();
            }
        }
        return max;
    }
}