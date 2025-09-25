class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n - 2]) return nums[n - 1];
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid + 1]) return nums[mid];
            int f = mid;
            int s = mid;
            if(nums[mid - 1] == nums[mid]) f = mid - 1;
            else s = mid + 1;
            int leftCount = f - low;
            int rightCount = high - s;

            if(leftCount % 2 == 0) low = s + 1;
            else high = f - 1;
        }
        return nums[high];
    }
}