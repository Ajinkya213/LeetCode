class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int secondElapsed = 0;
        while (tickets[k] > 0) {
            for(int i = 0; i < tickets.length ; i++){
                if (tickets[i] > 0){
                    tickets[i]--;
                    secondElapsed++;
                }

                if(tickets[k] == 0){
                    return secondElapsed;
                }
            }
        }
        return secondElapsed;
    }
}