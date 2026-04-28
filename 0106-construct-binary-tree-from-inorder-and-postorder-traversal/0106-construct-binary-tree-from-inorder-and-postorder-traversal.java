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
    int postIndex;
    Map<Integer, Integer> inMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        for(int i = 0 ; i < inorder.length ; i++){
            inMap.put(inorder[i], i);
        }
        return helper(postorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] postorder, int start, int end){
        if(start > end) return null;
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        int rootIdx = inMap.get(rootVal);

        root.right = helper(postorder, rootIdx + 1, end);
        root.left = helper(postorder, start, rootIdx - 1);
        

        return root;
    }
}