class Solution {
    public int change( int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solve(coins, 0, amount, dp);
        return ans;
    }
    public int solve(int[] coins, int i, int target, int[][] dp) {
        if (target == 0) return 1;

        if (i == coins.length) {
            return 0;
        }
        if (dp[i][target] != -1) {
            return dp[i][target];
        }
        int notPick = solve(coins, i + 1, target, dp);
        int pick = 0;
        if (coins[i] <= target) {
            pick = solve(coins, i, target - coins[i], dp);
        }
        return dp[i][target] = pick + notPick;
    }
}