class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int max = -1, secondMax = -1, idx = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? idx : -1;
    }
}
