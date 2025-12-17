class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] res = new int[rows][cols];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(mat[i][j] == 0){
                    res[i][j] = 0;
                    q.add(new int[]{i,j});
                }
                else res[i][j] = -1;
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            if(x - 1 >= 0 && res[x - 1][y] == -1){
                res[x - 1][y] = res[x][y] + 1;
                q.add(new int[]{x - 1, y});
            }
            if(x + 1 < rows && res[x + 1][y] == -1){
                res[x + 1][y] = res[x][y] + 1;
                q.add(new int[]{x + 1, y});
            }
            if(y - 1 >= 0 && res[x][y - 1] == -1){
                res[x][y - 1] = res[x][y] + 1;
                q.add(new int[]{x, y - 1});
            }
            if(y + 1 < cols && res[x][y + 1] == -1){
                res[x][y + 1] = res[x][y] + 1;
                q.add(new int[]{x, y + 1});
            }
        }
        return res;
    }
}