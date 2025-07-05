import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Efficient sorting (uses Dual-Pivot Quicksort under the hood)
        Arrays.sort(nums);

        // Check for consecutive duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
