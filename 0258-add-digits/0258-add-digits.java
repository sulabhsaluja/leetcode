class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            num = add(num);
        }
        return num;
    }

    public static int add(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
