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
    
    static class Pair {
        TreeNode node;
        int hd;
        int row;
        
        Pair(TreeNode n, int h, int r) {
            node = n;
            hd = h;
            row = r;
        }
    }
        
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        
        TreeMap<Integer, ArrayList<int[]>> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0, 0));
      
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int hd = curr.hd;
            int row = curr.row;
            TreeNode node = curr.node;
            
            mp.putIfAbsent(hd, new ArrayList<>());
            mp.get(hd).add(new int[]{row, node.val});
            
            if (node.left != null) 
                q.add(new Pair(node.left, hd - 1, row + 1));
            
            if (node.right != null)
                q.add(new Pair(node.right, hd + 1, row + 1));
        }
        
        // Sorting each column
        for (ArrayList<int[]> list : mp.values()) {
            Collections.sort(list, (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0]; // row
                return a[1] - b[1];                   // value
            });
            
            ArrayList<Integer> col = new ArrayList<>();
            for (int[] arr : list) {
                col.add(arr[1]);
            }
            
            ans.add(col);
        }
        
        return ans;
    }
}