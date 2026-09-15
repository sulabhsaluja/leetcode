class Solution {
    public int maxSubArray(int[] arr) {
        int curr = 0;
        int maxSum = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            curr += arr[i];
            if(curr > maxSum) maxSum = curr;
            if(curr < 0) curr = 0;
        }
        return maxSum;
    }
}