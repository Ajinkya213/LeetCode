class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        // Conditions to handle
        // loop through through the array from

        int numberOfAlternatingGroups = 0;
        for (int i = 0; i < colors.length - 2; i++){
            if (colors[i] != colors[i+1] && colors[i+1] != colors[i+2]){
                numberOfAlternatingGroups++;
            }
        }

        //Handling  secondlast and last elements;
        if (colors[colors.length - 2] != colors[colors.length - 1] && colors[colors.length - 1] != colors[0]){
            numberOfAlternatingGroups++;
        }

        if (colors[colors.length - 1] != colors[0] && colors[0] != colors[1]){
            numberOfAlternatingGroups++;
        }

        return numberOfAlternatingGroups;
    }
}