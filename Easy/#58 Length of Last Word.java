class Solution {
    public int lengthOfLastWord(String s) {

        boolean flag = false;
        int count = 0;
        int index = s.length() - 1;
    
    if (index == -1) {
        return count;
    }

    while (index >= 0 && s.charAt(index) == ' ') {
        index--;
    }

    while (index >= 0 && s.charAt(index) != ' ') {
        count++;
        index--;
    }

    return count;
    }
}