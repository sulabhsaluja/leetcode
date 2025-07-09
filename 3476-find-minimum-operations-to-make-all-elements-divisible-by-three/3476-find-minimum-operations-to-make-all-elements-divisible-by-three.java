class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int divBy3 = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]%3==0){
                divBy3++;
            }
        }
        return n - divBy3;
    }
}