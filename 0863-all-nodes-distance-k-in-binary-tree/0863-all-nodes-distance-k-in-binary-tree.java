/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildMap(root, null, parentMap);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> set = new HashSet<>();

        q.add(target);
        set.add(target);
        int dist = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(dist == k) break;
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = q.poll();
                if(curr.left != null && !set.contains(curr.left)){
                    set.add(curr.left);
                    q.add(curr.left);
                }
                if(curr.right != null && !set.contains(curr.right)){
                    set.add(curr.right);
                    q.add(curr.right);
                }
                TreeNode parent = parentMap.get(curr);
                if(parent != null && !set.contains(parent)){
                    set.add(parent);
                    q.add(parent);
                }
            }
            dist++;
        }

        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
        return res;



    }
    public static void buildMap(TreeNode node, TreeNode parent, HashMap<TreeNode, TreeNode> map){
        if(node == null) return;
        map.put(node, parent);
        buildMap(node.left, node, map);
        buildMap(node.right, node, map);
    }
}