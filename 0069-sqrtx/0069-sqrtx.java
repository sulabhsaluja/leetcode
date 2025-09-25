class Solution {
    public int mySqrt(int n) {
        //the square root of any number will must be between 1 and that number itself. So,
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if(square == n) return mid;
            else if(square > n) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
}