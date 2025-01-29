class Solution {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        for (String str : arr) {
            if (frequencyMap.get(str) == 1) {
                k--;
            }

            if (k == 0) {
                return str;
            }
        }

        return "";
    }
}