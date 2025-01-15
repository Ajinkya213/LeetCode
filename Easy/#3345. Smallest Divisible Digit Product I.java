class Solution {
    public int smallestNumber(int n, int t) {
        int divs = n;
        while(true){
            int d = splitMult(divs);
            if(d % t == 0 && divs >= n){
                return divs;
            }
            divs++;
        }
    }

    public static int splitMult(int num){
        int mult = 1;
        while(num != 0){
            mult *= num %10;
            num /= 10;
        }
        return mult;
    }
}