class Solution {
    public boolean isBipartite(int[][] graph) {
        int num_of_nodes = graph.length;
        int[] color = new int[num_of_nodes];
        Arrays.fill(color, -1);
        for(int i = 0 ; i < num_of_nodes ; i++){
            if(color[i] == -1){
                if(!checkBFS(graph, i, color)) return false;
            }
        }
        return true;
    }

    public boolean checkBFS(int[][] graph, int start, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nbr : graph[curr]){
                if(color[nbr] == -1){
                    color[nbr] = 1 - color[curr];
                    q.add(nbr);
                }else if(color[nbr] == color[curr]) return false;
            }
        }
        return true;
    }
}