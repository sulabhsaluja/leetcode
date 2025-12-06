class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int[][] dist = new int[n][n];
        int srcX = 0;
        int srcY = 0;
        int destX = n - 1;
        int destY = n - 1;

        if(grid[srcX][srcY] == 1 || grid[destX][destY] == 1) return -1;

        for(int[] row : dist){
            Arrays.fill(row, -1);
        }

        dist[srcX][srcY] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{srcX, srcY});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int i = top[0];
            int j = top[1];

            if(i == destX && j == destY) return dist[i][j];

            if(i - 1 >= 0 && j + 1 < n && grid[i - 1][j + 1] == 0 && dist[i - 1][j + 1] == -1){
                dist[i -1][j + 1] = dist[i][j] + 1;
                q.add(new int[]{i - 1, j + 1});
            }
            if(i + 1 < n && j + 1 < n && grid[i + 1][j + 1] == 0 && dist[i + 1][j + 1] == -1){
                dist[i + 1][j + 1] = dist[i][j] + 1;
                q.add(new int[]{i + 1, j + 1});
            }
            if(i - 1 >= 0 && j - 1 >= 0 && grid[i - 1][j - 1] == 0 && dist[i - 1][j - 1] == -1){
                dist[i - 1][j - 1] = dist[i][j] + 1;
                q.add(new int[]{i - 1, j - 1});
            }
            if(i + 1 < n && j - 1 >= 0 && grid[i + 1][j - 1] == 0 && dist[ i + 1][j - 1] == -1){
                dist[i + 1][j - 1] = dist[i][j] + 1;
                q.add(new int[]{i + 1, j - 1});
            }

            if(i + 1 < n && grid[i + 1][j] == 0 && dist[i + 1][j] == -1){
                dist[i + 1][j] = dist[i][j] + 1;
                q.add(new int[]{i + 1, j});
            }
            if(i - 1 >= 0 && grid[i - 1][j] == 0 && dist[i - 1][j] == -1){
                dist[i - 1][j] = dist[i][j] + 1;
                q.add(new int[]{i - 1, j});
            }
            if(j + 1 < n && grid[i][j + 1] == 0 && dist[i][j + 1] == -1){
                dist[i][j + 1] = dist[i][j] + 1;
                q.add(new int[]{i, j + 1});
            }
            if(j - 1 >= 0 && grid[i][j - 1] == 0 && dist[i][j - 1] == -1){
                dist[i][j - 1] = dist[i][j] + 1;
                q.add(new int[]{i, j - 1});
            }
        }
        return -1;
    }
}