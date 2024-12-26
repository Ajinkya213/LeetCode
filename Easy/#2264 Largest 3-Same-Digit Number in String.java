class Solution {
    public String largestGoodInteger(String num) {
        int large = -1;
        String res = "";
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                int n = Integer.parseInt(num.substring(i, i+3));
                if(n > large){
                    large = n;
                    res = num.substring(i, i+3);
                }
            }
        }
        return res;
    }
}