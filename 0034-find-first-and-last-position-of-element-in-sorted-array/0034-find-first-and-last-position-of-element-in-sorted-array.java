class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = firstOccurance(nums,target);
        int b = lastOccurance(nums,target);
        int[] arr = {a,b};
        return arr;
    }
    public int firstOccurance(int[] nums, int target){
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int idx = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                idx = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return idx;
    }
    public int lastOccurance(int[] nums, int target){
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int idx = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                idx = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return idx;
    }
}