class Solution {
    public String largestGoodInteger(String num) {
        String [] values = {"999","888","777","666","555","444","333","222","111","000",};

        for (String val: values) {
            if (num.contains(val)) return val;
        }
        return "";
    }
}