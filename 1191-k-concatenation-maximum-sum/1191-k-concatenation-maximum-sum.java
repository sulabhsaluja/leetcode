class Solution {
    int MOD = 1000000007;

    public int kConcatenationMaxSum(int[] arr, int k) {
        long totalSum = 0;

        // Total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Kadane on one array
        long one = kadane(arr, 1);

        if (k == 1) {
            return (int) (one % MOD);
        }

        // Kadane on two concatenated arrays
        long two = kadane(arr, 2);

        if (totalSum > 0) {
            return (int) ((two + (k - 2) * totalSum) % MOD);
        }

        return (int) (two % MOD);
    }

    private long kadane(int[] arr, int t) {
        long curr = 0;
        long max = 0;

        while(t-->0){
            for (int num : arr) {
                curr = Math.max(0, curr + num);
                max = Math.max(max, curr);
            }
        
        }
        return max;
    }
}