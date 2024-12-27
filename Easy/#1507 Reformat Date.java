class Solution {
    public String reformatDate(String date) {
        StringBuilder reformatedDate = new StringBuilder();
        String tokens [] = date.split(" ");

        reformatedDate.append(tokens[2]);
        reformatedDate.append("-");

        //Care month
        String month = "";
        switch(tokens[1]){
            case "Jan" : month = "01"; break;
            case "Feb" : month = "02"; break;
            case "Mar" : month = "03"; break;
            case "Apr" : month = "04"; break;
            case "May" : month = "05"; break;
            case "Jun" : month = "06"; break;
            case "Jul" : month = "07"; break;
            case "Aug" : month = "08"; break;
            case "Sep" : month = "09"; break;
            case "Oct" : month = "10"; break;
            case "Nov" : month = "11"; break;
            case "Dec" : month = "12"; break;
        }

        //System.out.println(map);
        reformatedDate.append(month);
        reformatedDate.append("-");


        //Care Day
        String f = "";
        for(int i = 0; i < tokens[0].length(); i++){
            if(Character.isDigit(tokens[0].charAt(i))){
                f += tokens[0].charAt(i);
            }else{
                break;
            }
        }

        if(Integer.valueOf(f) > 0 && Integer.valueOf(f) < 10){
            f = "0"+f;
        }

        reformatedDate.append(f);
        return reformatedDate.toString();
    }

}