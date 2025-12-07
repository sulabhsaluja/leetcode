class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(mat[i][j] == 0){
                    res[i][j] = 0;
                    q.add(new int[]{i, j});
                }
                else{
                    res[i][j] = -1;
                }

            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];

            if(i - 1 >= 0 && res[i - 1][j] == -1){
                res[i - 1][j] = res[i][j] + 1;
                q.add(new int[]{i - 1, j});
            } 
            if(i + 1 < n && res[i + 1][j] == -1){
                res[i + 1][j] = res[i][j] + 1;
                q.add(new int[]{i + 1, j});
            }
            if(j - 1 >= 0 && res[i][j - 1] == -1){
                res[i][j - 1] = res[i][j] + 1;
                q.add(new int[]{i, j - 1});
            }
            if(j + 1 < m && res[i][j + 1] == -1){
                res[i][j + 1] = res[i][j] + 1;
                q.add(new int[]{i, j + 1});
            }
        }
        return res;
    }
}