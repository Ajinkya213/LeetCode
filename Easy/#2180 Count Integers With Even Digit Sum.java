class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i = 2; i <= num; i++){
            int sum = digitSum(i);

            if(sum % 2 == 0){
                count++;
            }
        }

        return count;
    }

    public static int digitSum(int number){
        int sum = 0;
        while(number != 0){
            int k = number % 10;
            sum += k;
            number /= 10;
        }
        return sum;
    }
}