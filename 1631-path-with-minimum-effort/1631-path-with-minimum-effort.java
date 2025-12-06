class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        boolean[][] vis = new boolean[n][m];
        int[][] dist = new int[n][m];
        for(int[] row : dist){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[0], b[0]));

        pq.add(new int[]{0,0,0});

        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int effort = top[0];
            int i = top[1];
            int j = top[2];

            if(vis[i][j]) continue;

            vis[i][j] = true;

            if(i == n - 1 && j == m - 1) return effort;

            if(i - 1 >= 0){
                int diff = Math.abs(heights[i][j] - heights[i - 1][j]);
                int newEff = Math.max(effort, diff);
                if(newEff < dist[i - 1][j]){
                    dist[i - 1][j] = newEff;
                    pq.offer(new int[]{newEff, i - 1, j});
                }
            }

            if(j - 1 >= 0){
                int diff = Math.abs(heights[i][j] - heights[i][j - 1]);
                int newEff = Math.max(effort, diff);
                if(newEff < dist[i][j - 1]){
                    dist[i][j - 1] = newEff;
                    pq.offer(new int[]{newEff, i, j - 1});
                }
            }
            if(i + 1 < n){
                int diff = Math.abs(heights[i][j] - heights[i + 1][j]);
                int newEff = Math.max(effort, diff);
                if(newEff < dist[i + 1][j]){
                    dist[i + 1][j] = newEff;
                    pq.offer(new int[]{newEff, i + 1, j});
                }
            }
            if(j + 1 < m){
                int diff = Math.abs(heights[i][j] - heights[i][j + 1]);
                int newEff = Math.max(effort, diff);
                if(newEff < dist[i][j + 1]){
                    dist[i][j + 1] = newEff;
                    pq.offer(new int[]{newEff, i, j + 1});
                }
            }


        }
        return -1;
    }
}