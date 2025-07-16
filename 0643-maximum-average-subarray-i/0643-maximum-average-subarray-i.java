class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0 , n = nums.length;
        
        for(int i = 0 ; i < k ; i++){
            currSum+=nums[i];
        }
        int maxSum = currSum;

        for(int i = 1 ; i <= n-k ; i++){
            currSum = currSum + nums[i + k - 1] - nums[i-1];

            if(currSum > maxSum) maxSum = currSum;
        }
        return (double)maxSum / k;
    }
}