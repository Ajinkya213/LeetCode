class Solution {
    public int alternateDigitSum(int n) {
        String f = ""+n;
        int sum = 0;
        for(int i = 0; i < f.length(); i++){
            int k = 0;
            if(i % 2 == 0){
                k = f.charAt(i) - '0';
            }else{
                k = f.charAt(i) - '0';
                k = -k;
            }
            sum += k;
        }
        return sum;
    }
}