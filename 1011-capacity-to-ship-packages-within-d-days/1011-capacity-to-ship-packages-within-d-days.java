class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight : weights){
            low = Math.max(low, weight);
            high += weight;
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(func(weights, mid) <= days){
                high = mid - 1;
                ans = mid;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int func(int[] weights, int capacity){
        int days = 1;
        int load = 0;
        for(int i = 0 ; i < weights.length ; i++){
            if(load + weights[i] > capacity){
                days++;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
}