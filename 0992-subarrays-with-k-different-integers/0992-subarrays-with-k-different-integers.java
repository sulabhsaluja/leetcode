class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    private int atMost(int[] nums, int k){
        int n = nums.length;
        int start = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int end = 0 ; end < n ; end++){
            int ele = nums[end];
            if(!map.containsKey(ele)){
                k--;
            }
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            while(k < 0){
                if(map.get(nums[start]) == 1) k++;
                map.put(nums[start], map.get(nums[start]) - 1);
                if(map.get(nums[start]) == 0) map.remove(nums[start]);
                start++;
            }
            cnt += end - start + 1;

        }
        return cnt;
    }
}