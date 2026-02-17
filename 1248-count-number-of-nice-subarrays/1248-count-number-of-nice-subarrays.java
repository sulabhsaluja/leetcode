class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    private int atMost(int[] nums, int k){
        int n = nums.length;
        int start = 0;
        int cnt = 0;
        for(int end = 0; end < n ; end++){
            int odd = nums[end] % 2;
            if(odd == 1) k--;
            while(k < 0){
                if(nums[start] % 2 == 1) k++;
                start++;
            }
            cnt += (end - start) + 1;
        }
        return cnt;
    }
}