class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        if (nums.length == 0) return arr;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (arr[0] == -1) arr[0] = i;
                arr[1] = i;
            }
        }
        return arr;
    }
}
