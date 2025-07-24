class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        while( n > 0){
            if(n == 1) return true;
            if(n % 4 != 0) break;
            n /= 4;
        }
        return false;
    }
}