class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;

        // Move all non-zero elements to the front
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Fill remaining elements with 0
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
