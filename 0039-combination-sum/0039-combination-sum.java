class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
        
    }
    public void solve(int[] nums, int target, List<List<Integer>> ans, List<Integer> curr, int index){
        if(target < 0 || index >= nums.length) return;
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
            curr.add(nums[index]);
            solve(nums, target - nums[index], ans, curr, index);
            curr.remove(curr.size() - 1);
            solve(nums, target, ans, curr, index + 1);
        
    }
    
}