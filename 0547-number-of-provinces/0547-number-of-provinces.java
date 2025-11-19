class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        // Build adjacency list
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj[i].add(j);
                }
            }
        }

        boolean[] vis = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                cnt++;
                dfs(i, vis, adj);
            }
        }

        return cnt;
    }

    private void dfs(int u, boolean[] vis, List<Integer>[] adj) {
        vis[u] = true;

        for (int nbr : adj[u]) {
            if (!vis[nbr]) {
                dfs(nbr, vis, adj);
            }
        }
    }
}
