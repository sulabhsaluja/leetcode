class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums, goal - 1);
    }
    public int atMost(int[] arr, int goal){
        int start = 0;
        int curr = 0;
        int ans = 0;
        if(goal < 0) return 0;
        for(int end = 0 ; end < arr.length ; end++){
            curr += arr[end];
            while(curr > goal){
                curr -= arr[start];
                start++;
            }
            ans += (end - start) + 1;
        }
        return ans;
    }
}