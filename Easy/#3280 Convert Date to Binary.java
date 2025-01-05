class Solution {
    public String convertDateToBinary(String date) {
        String convertedDate ="";
        String dateArray [] = date.split("-");
        for(int i = 0; i < dateArray.length ; i++){
            convertedDate += Integer.toBinaryString(Integer.parseInt(dateArray[i]));
            if (i < 2){
                convertedDate += "-";
            }
        }
        return convertedDate;
    }
}