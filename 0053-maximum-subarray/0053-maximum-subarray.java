class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int curr = arr[0];
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            curr = Math.max(arr[i], arr[i] + curr);
            max = Math.max(curr, max);
        }
        return max;
    }
}