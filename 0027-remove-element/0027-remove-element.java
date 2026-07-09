class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int n = nums.length;
        for(int right = 0 ; right < n ; right++){
            if(nums[right] != val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return left;
    }
}