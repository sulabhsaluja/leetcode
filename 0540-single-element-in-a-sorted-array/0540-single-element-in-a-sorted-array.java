class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n - 2]) return nums[n - 1];
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid + 1]) return nums[mid];
            int firstOccurance = mid;
            int lastOccurance = mid;
            if(nums[mid - 1] == nums[mid]) firstOccurance = mid - 1;
            else lastOccurance = mid + 1;
            int leftCount = firstOccurance - low;
            int rightCount = high - lastOccurance;

            if(leftCount % 2 == 0) low = lastOccurance + 1;
            else high = firstOccurance - 1;
        }
        return nums[low];
    }
}