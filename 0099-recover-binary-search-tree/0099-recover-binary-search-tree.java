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
    public void recoverTree(TreeNode root) {
        List<TreeNode> li = new ArrayList<>();
        inOrder(root,li);
        TreeNode firstBad = null;
        TreeNode secondBad = null;

        for(int i = 1 ; i < li.size() ; i++){
            TreeNode prev = li.get(i - 1);
            TreeNode curr = li.get(i);

            if(prev.val > curr.val){
                if(firstBad == null) firstBad = prev;
                secondBad = curr;
            }
        }
        int temp = firstBad.val;
        firstBad.val = secondBad.val;
        secondBad.val = temp;

    }
    public void inOrder(TreeNode root, List<TreeNode> li){
        if(root == null) return;
        inOrder(root.left, li);
        li.add(root);
        inOrder(root.right, li);
    }
}