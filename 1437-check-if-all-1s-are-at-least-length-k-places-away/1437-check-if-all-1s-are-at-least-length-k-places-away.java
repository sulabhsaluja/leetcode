class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = -1;
        int n = nums.length;
        for(int j = 0 ; j < n ; j++){
            if(nums[j] == 1){
                if(i != -1 && j - i - 1 < k) return false;
                i = j;
            }
        }
        return true;
    }
}