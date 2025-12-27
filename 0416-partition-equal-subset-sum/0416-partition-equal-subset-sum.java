class Solution {
    public boolean canPartition(int[] nums) {
        long sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum+=nums[i];
        }
        if(sum % 2 != 0) return false;
        return check(nums,nums.length, sum / 2) == 1 ? true : false;
    }
    public int check(int[] nums, int n, long sum){
        
        if(sum == 0) return 1;
        if(n == 0) return 0;

        if(nums[n - 1] > sum) return check(nums, n - 1, sum);

        if((check(nums, n - 1, sum - nums[n - 1]) == 1 || check(nums, n - 1, sum) == 1)) return 1;

        return 0;
    }

}