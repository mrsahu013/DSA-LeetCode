class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int result;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            product = product * rem;
            sum = sum + rem;
        }

        result = product - sum;
        return result;
    }
}