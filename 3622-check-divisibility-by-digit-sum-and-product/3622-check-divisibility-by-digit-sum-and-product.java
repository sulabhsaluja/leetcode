class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n/=10;
        }
        int divisor = sum + prod;
        return temp % divisor == 0 ? true : false;
    }
}