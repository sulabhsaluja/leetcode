class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solve(coins, 0, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int solve(int[] coins, int i, int target, int[][] dp) {
        if (target == 0) return 0;

        if (i == coins.length) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][target] != -1) {
            return dp[i][target];
        }
        int notPick = solve(coins, i + 1, target, dp);
        int pick = Integer.MAX_VALUE;
        if (coins[i] <= target) {
            int res = solve(coins, i, target - coins[i], dp);
            if (res != Integer.MAX_VALUE) {
                pick = 1 + res;
            }
        }
        return dp[i][target] = Math.min(pick, notPick);
    }
}
//     public int coinChange(int[] coins, int amount) {
//         int ans = solve(coins, 0, amount);
//         return ans == Integer.MAX_VALUE ? -1 : ans;
//     }
//     public int solve(int[] coins, int i, int target) {
//         if (target == 0) return 0;
//         if (i == coins.length) {
//             return Integer.MAX_VALUE;
//         }

//         int notPick = solve(coins, i + 1, target);

//         int pick = Integer.MAX_VALUE;
//         if (coins[i] <= target) {
//             int res = solve(coins, i, target - coins[i]);
//             if (res != Integer.MAX_VALUE) {
//                 pick = 1 + res;
//             }
//         }
        

//         return Math.min(pick, notPick);
//     }
// }