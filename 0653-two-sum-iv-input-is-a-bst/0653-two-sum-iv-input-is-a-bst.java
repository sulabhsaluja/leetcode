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
    public boolean findTarget(TreeNode root, int k) {
       ArrayList<Integer> li = new ArrayList<>();
       inOrder(root, li);
        int i = 0;
        int j = li.size() - 1;
        while(i < j){
            int s = li.get(i) + li.get(j);
            if(s == k) return true;
            if(s < k) i++;
            else j--;
        }
        return false;
    }
    public void inOrder(TreeNode root, ArrayList<Integer> li){
        if(root == null) return;
        inOrder(root.left, li);
        li.add(root.val);
        inOrder(root.right, li);
    }
}