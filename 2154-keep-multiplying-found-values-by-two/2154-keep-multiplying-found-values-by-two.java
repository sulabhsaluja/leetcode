class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int val = original;
        while(set.contains(val)) val*=2;

        return val;
    }
}