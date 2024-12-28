class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int maxIterations = tickets[k];
        int count = 0;
        int timeRequired = 0;
        for(int i=0;i<tickets.length;i++) {
            if(i <= k) {
                timeRequired += Math.min(maxIterations,tickets[i]);
            }
            else {
                timeRequired += Math.min(maxIterations-1, tickets[i]);
            }
        }
        return timeRequired;
    }
}