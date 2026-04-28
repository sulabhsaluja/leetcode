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

    // int preorderIndex = 0;
    // Map<Integer, Integer> inorderMap = new HashMap<>();

    // public TreeNode buildTree(int[] preorder, int[] inorder) {
    //     for (int i = 0; i < inorder.length; i++) {
    //         inorderMap.put(inorder[i], i);
    //     }
    //     return helper(preorder, 0, inorder.length - 1);
    // }

    // private TreeNode helper(int[] preorder, int start, int end) {
    //     if (start > end) return null;

    //     int rootVal = preorder[preorderIndex++];
    //     TreeNode root = new TreeNode(rootVal);
    //     int rootIndex = inorderMap.get(rootVal);

    //     root.left = helper(preorder, start, rootIndex - 1);
    //     root.right = helper(preorder, rootIndex + 1, end);

    //     return root;
    // }


    int preIndex = 0;
    Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < inorder.length ; i++){
            inMap.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int start, int end){
        if(start > end) return null;
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int rootIdx = inMap.get(rootVal);

        root.left = helper(preorder, start, rootIdx - 1);
        root.right = helper(preorder, rootIdx + 1, end);

        return root;
    }

}