class Solution {
    public int arrangeCoins(int n) {
        //Binary Search
        long low = 0;
        long high = n;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long coinsUsed = mid * (mid + 1) / 2;
            if(coinsUsed == n) return (int)mid;
            else if(coinsUsed > n) high = mid - 1;
            else low = mid + 1;
        }
        return (int)high;
    }
}