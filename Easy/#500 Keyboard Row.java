class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List <String> list = new ArrayList();
        for(int i = 0; i < words.length; i++){
            //Turn each character to lower case
            //words[i] = words[i].toLowerCase();

            boolean missed1 = false;
            boolean missed2 = false;
            boolean missed3 = false;

            //Find in row1
            if(row1.contains(words[i].substring(0,1).toLowerCase())){
                for(int j = 1; j < words[i].length(); j++){
                    if(!row1.contains(words[i].substring(j,j+1).toLowerCase())){
                        missed1 = true;
                        break;
                    }
                }
                //Find in row2
            }else if(row2.contains(words[i].substring(0,1).toLowerCase())){
                for(int j = 1; j < words[i].length(); j++){
                    if(!row2.contains(words[i].substring(j,j+1).toLowerCase())){
                        missed2 = true;
                        break;
                    }
                }

                //Find in row3
            }else if (row3.contains(words[i].substring(0,1).toLowerCase())){
                for(int j = 1; j < words[i].length(); j++){
                    if(!row3.contains(words[i].substring(j,j+1).toLowerCase())){
                        missed3 = true;
                        break;
                    }
                }
            }

            //System.out.println(missed1 +" | "+missed2 +" | "+ missed3);
            if(!missed1 && !missed2 && !missed3){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}