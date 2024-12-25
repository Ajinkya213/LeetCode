class Solution {
    public boolean divisorGame(int n) {
        //Simulation
        boolean aliceWins = false;
        while(n != 0){
            if(n % 1 == 0){
                n -= 1;
                if(!aliceWins){
                    aliceWins = true;
                }else{
                    aliceWins = false;
                }
            }
        }
        return !aliceWins;
    }
}