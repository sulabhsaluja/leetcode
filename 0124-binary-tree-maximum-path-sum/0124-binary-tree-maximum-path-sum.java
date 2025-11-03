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
    // public int maxSum = Integer.MIN_VALUE;

    // public int solve(TreeNode root) {
    //     if (root == null) return 0;

    //     int leftSum = solve(root.left);
    //     int rightSum = solve(root.right);

    //     int allSum = leftSum + rightSum + root.val;
    //     int onlyOnePath = Math.max(leftSum, rightSum) + root.val;
    //     int rootOnly = root.val;
        
    //     maxSum = Math.max(maxSum, Math.max(allSum, Math.max(onlyOnePath, rootOnly)));

    //     return Math.max(onlyOnePath, rootOnly);
    // }

    // public int maxPathSum(TreeNode root) {
    //     solve(root);
    //     return maxSum;
    // }

    public int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        solve(root);
        return maxSum;
    }
    public int solve(TreeNode root){
        if(root == null) return 0;

        int rightSum = solve(root.right);
        int leftSum = solve(root.left);

        int allPathSum = rightSum + leftSum + root.val;
        int onlyTwoPath = root.val + Math.max(rightSum, leftSum);
        int onlyRoot = root.val;

        maxSum = Math.max(maxSum, Math.max(allPathSum, Math.max(onlyTwoPath, onlyRoot)));

        return Math.max(onlyTwoPath, onlyRoot);
    }
}
