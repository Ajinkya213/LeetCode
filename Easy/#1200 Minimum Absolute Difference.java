class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int diff [] = new int [arr.length -1];

        Arrays.sort(arr);

        int minAbosuluteDiffrence = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length -1; i++){
            diff [i] = Math.abs(arr[i+1] - arr[i]);
            minAbosuluteDiffrence = Math.min(minAbosuluteDiffrence, diff [i]);
            System.out.println(diff [i]);
        }

        for(int i = 0; i < diff.length; i++){
            if(minAbosuluteDiffrence == diff[i]){
                List<Integer> sect = new ArrayList<>();
                sect.add(arr[i]);
                sect.add(arr[i+1]);
                list.add(sect);
            }
        }

        return list;
    }
}