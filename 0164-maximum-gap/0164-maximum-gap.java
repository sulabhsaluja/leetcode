class Solution {
    public int maximumGap(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1 ; i++){
            int diff = Math.abs(nums[i] - nums[i+1]);
            max = Math.max(diff,max);
        }
        return max;
    }
}