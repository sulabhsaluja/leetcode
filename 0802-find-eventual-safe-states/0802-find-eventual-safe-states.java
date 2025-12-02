class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < graph.length ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < graph.length ; i++){
            for(int node : graph[i]){
                adj.get(node).add(i);
            }
        }

        int[] indeg = new int[graph.length];
        for(int i = 0 ; i < graph.length ; i++){
            for(int it : adj.get(i)) indeg[it]++;
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < indeg.length ; i++){
            if(indeg[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);

            for(int nbr : adj.get(curr)){
                indeg[nbr]--;
                if(indeg[nbr] == 0) q.add(nbr);
            }
        }
        Collections.sort(res);
        return res;
    }
}