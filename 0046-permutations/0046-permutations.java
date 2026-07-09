class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[n];

        solve(nums, curr, ans, used);
        return ans;
    }
    public void solve(int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] used){
        int n = nums.length;
        if(curr.size() == n){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0 ; i < n ; i++){
            if(used[i] == true) continue;

            curr.add(nums[i]);
            used[i] = true;
            solve(nums, curr, ans, used);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}