class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int w : weights){
            low = Math.max(low, w);
            high += w;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;

            int d = func(weights, mid);
            if(d <= days){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public static int func(int[] arr, int capacity){
        int days = 1;
        int load = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] + load > capacity){
                days++;
                load = arr[i];
            }else load += arr[i];
            
        }
        return days;
    }
}