class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        List <Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(set.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }
        int result [] = new int [list.size()];
        for(int i = 0; i < result.length ; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}