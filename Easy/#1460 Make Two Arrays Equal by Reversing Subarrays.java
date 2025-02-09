class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer>  map= new HashMap<>();
        for (int i =0 ; i < target.length; i++){
            if(!map.containsKey(target[i])){
                map.put(target[i], 1);
            }else{
                map.put(target[i], map.get(target[i]) + 1);
            }
        }

        for(int i : arr){
            if(!map.containsKey(i)){
                return false;
            }

            map.put(i, map.get(i) - 1);
            if(map.get(i) == 0){
                map.remove(i);
            }
        }

        return map.size() == 0;
    }
}