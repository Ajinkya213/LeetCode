class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;
        while(n>0){
            sum=n%10 -sum;
            n=n/10;
        }
        return sum;
    }
}