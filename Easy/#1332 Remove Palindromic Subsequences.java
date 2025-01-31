class Solution {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s))   return 1;
        return 2;
    }
    public  boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j)    if(str.charAt(i++)!=str.charAt(j--))    return false;
        return  true;
    }
}