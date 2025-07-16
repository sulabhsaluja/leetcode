class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        int n = nums.length;
        for(int i = 0 ; i < k ; i++){
            currSum+=nums[i];
        }
        double maxSum = currSum;
        for(int i = 1 ; i <= n-k ; i++){
            currSum = currSum + nums[i+k-1] - nums[i-1];
            if(currSum > maxSum) maxSum = currSum;
        }
        return maxSum / k;
    }
}