/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> rightView = new ArrayList<>();
        if(root == null) return rightView;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> lvl = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode x = q.poll();
                lvl.add(x.val);
                if(x.left != null) q.add(x.left);
                if(x.right != null) q.add(x.right);
            }
            ans.add(lvl);
        }
        for(List<Integer> li : ans){
                rightView.add(li.get(li.size() - 1));
        }
        return rightView;
    }
}