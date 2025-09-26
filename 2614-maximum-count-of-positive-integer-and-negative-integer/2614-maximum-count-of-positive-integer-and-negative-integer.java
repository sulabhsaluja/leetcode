class Solution {
    public int maximumCount(int[] nums) {
        int posCount = positiveCount(nums);
        int negCount = negativeCount(nums);
        return Math.max(posCount,negCount);
    }
    public int negativeCount(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] >= 0){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return high + 1;

    }
    public int positiveCount(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > 0){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return n - low;

    }
}