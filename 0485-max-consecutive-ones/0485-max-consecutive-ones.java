class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;
        for(int num : nums){
            if(num == 1){
                currCount++;
                if(currCount > maxCount) maxCount = currCount;
            }
            else currCount = 0;
        }
        return maxCount;
    }
}