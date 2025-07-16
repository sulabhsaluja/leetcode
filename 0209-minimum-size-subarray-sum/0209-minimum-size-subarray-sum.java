class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, n = nums.length, ans = n + 1, window = 0;
        for(int right = 0 ; right < n ; right++){
            window+=nums[right];
            while(window >= target){
                ans = Math.min(ans, right - left + 1);
                window -= nums[left];
                left++;
            }
        }
        return ans == n + 1 ? 0 : ans;
    }
}