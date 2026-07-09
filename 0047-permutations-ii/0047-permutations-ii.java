class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[n];

        solve(nums, curr, set, used);
        for(List<Integer> list : set) ans.add(list);
        return ans;

    }
    public void solve(int[] nums, List<Integer> curr, HashSet<List<Integer>> ans, boolean[] used){
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