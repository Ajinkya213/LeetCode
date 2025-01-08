class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map <Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }
        }

        //System.out.println(map);
        int majorityElement = 0;
        for(Map.Entry<Integer, Integer> entity : map.entrySet()){
            if(entity.getValue() > n/2){
                majorityElement = entity.getKey();
            }
        }
        return majorityElement;
    }
}