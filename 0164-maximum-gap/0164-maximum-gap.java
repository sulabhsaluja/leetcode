class Solution {
    public int maximumGap(int[] nums) {
        int maxDiff = 0;
        Arrays.sort(nums);
        int left = 0;
        for(int right = 1 ; right < nums.length ; right++){
            int currDif = nums[right] - nums[left];
            if(currDif > maxDiff){
                maxDiff = currDif;
            }
            left++;
        }
        return maxDiff;
    }
}