class Solution {
    static int[][] dp ;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++) sum += nums[i];
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        dp = new int[n + 1][target + 1];
        for(int[] row : dp) Arrays.fill(row, -1);
        return check(nums, n, target) == 1;
    }

    public int check(int[] nums, int n, int target){
        if(target == 0) return 1;
        if(n == 0) return 0;
        if(dp[n][target] != -1) return dp[n][target];
        if(nums[n - 1] > target){
            dp[n][target] = check(nums, n - 1, target);
        }
        else{
            if(check(nums, n - 1, target - nums[n - 1]) == 1 || check(nums, n - 1, target) == 1) dp[n][target] = 1;
            else dp[n][target] = 0;
        }
        return dp[n][target];
    }
}