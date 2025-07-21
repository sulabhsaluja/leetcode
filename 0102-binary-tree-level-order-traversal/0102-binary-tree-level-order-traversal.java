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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return res;

        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();

            List<Integer> li = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode removedNode = q.poll();

                li.add(removedNode.val);

                if(removedNode.left != null) q.offer(removedNode.left);
                if(removedNode.right != null) q.offer(removedNode.right);
            }
            res.add(li);
        }
        return res;
    }
}