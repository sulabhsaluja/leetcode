class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dist = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 0){
                    dist[i][j] = 0;
                    q.add(new int[]{i,j});
                }else{
                    dist[i][j] = -1;
                }
            }
        }

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int i = cell[0];
            int j = cell[1];


            //Up
            if(i - 1 >= 0 && dist[i - 1][j] == -1){
                dist[i-1][j] = dist[i][j] + 1;
                q.add(new int[]{i - 1, j});
            }

            //Down
            if(i + 1 < m && dist[i + 1][j] == -1){
                dist[i + 1][j] = dist[i][j] + 1;
                q.add(new int[]{i + 1,j});
            }

            //Left
            if(j - 1 >= 0 && dist[i][j - 1] == -1){
                dist[i][j - 1] = dist[i][j] + 1;
                q.add(new int[]{i, j - 1});
            }

            //Right
            if(j + 1 < n && dist[i][j + 1] == -1){
                dist[i][j + 1] = dist[i][j] + 1;
                q.add(new int[]{i,j + 1});
            }
        }
        return dist;
    }
}