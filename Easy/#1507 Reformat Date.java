class Solution {
    public String reformatDate(String date) {
        StringBuilder reformatedDate = new StringBuilder();
        String tokens [] = date.split(" ");

        reformatedDate.append(tokens[2]);
        reformatedDate.append("-");

        //Care month
        Map<String, String> map = new HashMap<>();
        String [] month = new String []{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for(int i = 0 ; i < month.length; i++){
            if(i >= 0 && i < 9){
                int num = i + 1;
                map.put(month[i], "0"+num);
            }else{
                int num = i + 1;
                map.put(month[i], num+"");
            }
        }

        //System.out.println(map);
        reformatedDate.append(map.get(tokens[1]));
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