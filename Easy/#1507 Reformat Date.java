class Solution {
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        StringBuilder res = new StringBuilder();
        res.append(str[2]);
        String month = str[1].equals("Jan") ? "01"
                : str[1].equals("Feb") ? "02"
                : str[1].equals( "Mar" )? "03"
                : str[1].equals("Apr") ? "04"
                : str[1].equals("May") ? "05"
                : str[1].equals("Jun") ? "06"
                : str[1].equals("Jul") ? "07"
                : str[1].equals("Aug") ? "08"
                : str[1].equals("Sep") ? "09"
                : str[1].equals("Oct") ? "10"
                : str[1].equals("Nov") ? "11"
                : "12";
        res.append("-");
        res.append(month);
        res.append("-");
        if(str[0].length() == 3){
            res.append("0");
            res.append(str[0].charAt(0));
        }else{
            res.append(str[0].charAt(0));
            res.append(str[0].charAt(1));
        }

        return res.toString();
    }
}