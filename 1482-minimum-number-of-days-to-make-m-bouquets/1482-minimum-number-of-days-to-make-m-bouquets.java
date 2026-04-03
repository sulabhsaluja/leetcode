class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = bloomDay[0];
        int high = Integer.MIN_VALUE;
        if ((long)m * k > bloomDay.length) return -1;
        int ans = 0;
        for(int val : bloomDay){
            low = Math.min(low, val);
            high = Math.max(high, val);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(!isPossible(bloomDay, mid, m, k)) low = mid + 1;
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int day, int m, int k){
        int cnt = 0;
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= day){
                cnt++;
            }else{
                ans += (cnt/k);
                cnt = 0;
            }

        }
        ans += (cnt/k);
        return ans >= m;
    }
    
}