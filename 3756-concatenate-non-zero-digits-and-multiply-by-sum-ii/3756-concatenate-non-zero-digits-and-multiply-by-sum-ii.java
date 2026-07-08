class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        // Compressed string containing only non-zero digits
        StringBuilder t = new StringBuilder();

        // Maps original index -> compressed index
        int[] idx = new int[n];
        Arrays.fill(idx, -1);

        int m = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0') {
                idx[i] = m++;
                t.append(s.charAt(i));
            }
        }

        // next non-zero index in compressed string
        int[] next = new int[n + 1];
        next[n] = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (idx[i] != -1) next[i] = idx[i];
            else next[i] = next[i + 1];
        }

        // previous non-zero index in compressed string
        int[] prev = new int[n];
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (idx[i] != -1) last = idx[i];
            prev[i] = last;
        }

        // prefix number, prefix digit sum, powers of 10
        long[] prefNum = new long[m + 1];
        int[] prefSum = new int[m + 1];
        long[] pow10 = new long[m + 1];

        pow10[0] = 1;

        for (int i = 0; i < m; i++) {
            int d = t.charAt(i) - '0';
            prefNum[i + 1] = (prefNum[i] * 10 + d) % MOD;
            prefSum[i + 1] = prefSum[i] + d;
            pow10[i + 1] = (pow10[i] * 10) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {
            int l = queries[k][0];
            int r = queries[k][1];

            int L = next[l];
            int R = prev[r];

            if (L == -1 || R == -1 || L > R) {
                ans[k] = 0;
                continue;
            }

            int len = R - L + 1;

            long num = (prefNum[R + 1]
                    - prefNum[L] * pow10[len] % MOD
                    + MOD) % MOD;

            long sum = prefSum[R + 1] - prefSum[L];

            ans[k] = (int) ((num * sum) % MOD);
        }

        return ans;
    }
}