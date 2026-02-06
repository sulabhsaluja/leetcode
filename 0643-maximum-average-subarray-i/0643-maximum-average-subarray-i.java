class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        int n = nums.length;
        double sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum+=nums[i];
        }
        double maxSum = sum;
        for(int i = 1 ; i <= n - k ; i++){
            sum = sum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }
}