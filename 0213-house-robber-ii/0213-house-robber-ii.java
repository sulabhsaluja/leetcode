class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int case1 = func(nums, 0, n - 2);
        int case2 = func(nums, 1, n - 1);
        return Math.max(case1, case2);
    }
    public int func(int[] nums, int start, int end){
        int n = end - start + 1;
        if(n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[start];

        for(int i = 2 ; i <= n ; i++){
            int pick = dp[i - 2] + nums[start + i - 1];
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[n];
    }
}