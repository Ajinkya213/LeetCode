class Solution {
    public String removeOccurrences(String s, String part) {
        //StringBuilder str = new StringBuilder(s);

        while(s.contains(part)){
            StringBuilder str = new StringBuilder(s);
            int index = str.indexOf(part);
            str = str.delete(index, index+part.length());
            s = str.toString();
        }
        return s;
    }
}