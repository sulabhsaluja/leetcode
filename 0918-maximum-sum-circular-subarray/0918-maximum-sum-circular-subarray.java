class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int currMax = arr[0];
        int max = arr[0];
        int currMin = arr[0];
        int min = arr[0];
        int total = arr[0];
        for(int i = 1 ; i < n ; i++){
            total += arr[i];
            currMax = Math.max(arr[i], arr[i] + currMax);
            max = Math.max(currMax, max);

            currMin = Math.min(arr[i], arr[i] + currMin);
            min = Math.min(min, currMin);

            
        }
        if(max < 0) return max;
        
        return Math.max(max, total - min);
    }
}