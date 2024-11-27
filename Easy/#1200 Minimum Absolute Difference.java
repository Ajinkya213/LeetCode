class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);


        int minAbsDifference = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minAbsDifference = Math.min(minAbsDifference, arr[i] - arr[i-1]);
        }


        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == minAbsDifference) {
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }

        return result;
    }
}