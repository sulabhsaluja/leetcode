class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while(right < n){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                
            }
            right++;
            // else if(nums[left] == 0 && nums[right] == 0){
            //     right++;
            // }
            // else{
            //     left++;
            // }

        }
    }
}