class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        
        q.offer(root);
        q.offer(null); // Marker for end of level
        
        while (!q.isEmpty()) {
            TreeNode removedNode = q.poll();

            if (removedNode == null) {
                res.add(new ArrayList<>(li)); // Add current level to result
                li.clear(); // Clear the list for the next level
                
                if (!q.isEmpty()) {
                    q.offer(null); // Mark the end of the next level
                }
            } else {
                li.add(removedNode.val); // Add current node's value to the level list
                
                // Add children to the queue
                if (removedNode.left != null) {
                    q.offer(removedNode.left);
                }
                if (removedNode.right != null) {
                    q.offer(removedNode.right);
                }
            }
        }
        
        return res;
    }
}
