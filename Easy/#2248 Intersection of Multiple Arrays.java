class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0 ; i < len; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(!map.containsKey(nums[i][j])){
                    map.put(nums[i][j], 1);
                }else{
                    map.put(nums[i][j], map.get(nums[i][j]) + 1);
                }
            }
        }

        List <Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == len){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}