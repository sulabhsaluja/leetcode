class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        int maxSoFar = 0;
        long runningSum = 0;

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            runningSum += nums[i] + maxSoFar;
            ans[i] = runningSum;
        }

        return ans;
    }
}
