class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arrSum = 0;
        for(int i = 0 ; i < n ; i++){
            arrSum+=nums[i];
        }
        int origSum = 0;
        for(int i = 0 ; i <= n ; i++){
            origSum+=i;
        }
        return origSum - arrSum;

    }
}