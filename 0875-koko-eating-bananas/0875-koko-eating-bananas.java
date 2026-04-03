class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = high;
        int totalTime = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            totalTime = reqTime(piles, mid);
            if(totalTime <= h){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
        
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int reqTime(int[] arr, int hourly){
        int Totalhr = 0;
        for(int i = 0 ; i < arr.length ; i++){
            Totalhr += (int)Math.ceil((double)arr[i] /hourly);
        }
        return Totalhr;
    }
}