class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int low = 1;
        int high = findMax(arr);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long hours = reqTime(arr, mid);
            if(hours <= h){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            max = Math.max(max, x);
        }
        return max;
    }
    public long reqTime(int[] arr, int hourly){
        long total = 0;
        for(int x : arr){
            total += (x + hourly - 1) / hourly;
        }
        return total;
    }
}