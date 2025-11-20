class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        // binary search on possible max subarray sum
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, mid, k)) {
                high = mid;      // mid works, try smaller
            } else {
                low = mid + 1;   // mid too small
            }
        }

        return low; // or high, both same
    }

    // returns true if we can split nums into <= k parts with max sum <= limit
    private boolean canSplit(int[] nums, int limit, int k) {
        int parts = 1;
        int current = 0;

        for (int n : nums) {
            if (current + n <= limit) {
                current += n;
            } else {
                parts++;
                current = n;
                if (parts > k) return false; // exceeded allowed splits
            }
        }

        return true;
    }
}
