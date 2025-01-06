class Solution {
    public int[] minOperations(String boxes) {
        int [] minOps = new int [boxes.length()];

        for(int i = 0; i < boxes.length(); i++){
            //Front side ->
            int hops = 0;
            for(int j = 0; j < i; j++){
                if(boxes.charAt(j) == '1'){
                    hops+= Math.abs(i - j);
                }
            }

            // <-Back side

            for(int j = i; j < boxes.length(); j++){
                if(boxes.charAt(j) == '1'){
                    hops+= Math.abs(i - j);
                }
            }

            minOps[i] = hops;
        }

        return minOps;
    }
}