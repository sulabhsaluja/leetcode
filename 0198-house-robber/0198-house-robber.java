class Solution {
    public static int rob(int[] nums) {
        int prev1 = 0, prev2 = 0; // prev1: last, prev2: one before last
        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + num); // choose best option at each step
            prev2 = temp;
        }
        return prev1;
    }
}