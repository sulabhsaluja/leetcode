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
    public int maxDepth(TreeNode root) {

        if(root==null) return 0;
        // int leftHeight = maxDepth(root.left);
        // int rightHeight = maxDepth(root.right);
        // return Math.max(rightHeight,leftHeight) + 1;

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> lvl = new ArrayList();
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode currNode = q.poll();
                lvl.add(currNode.val);
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
            ans.add(lvl);
        }
        return ans.size();
    }
}