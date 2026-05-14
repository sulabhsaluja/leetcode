class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int minutes = 0;
        int freshCount = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 2) q.add(new int[]{i,j});
                else if(grid[i][j] == 1) freshCount++;
            }
        }
        if (freshCount == 0) return 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int x = 0 ; x < size ; x++){
                int[] curr = q.poll();
                int i = curr[0];
                int j = curr[1];

                if(i - 1 >= 0 && grid[i - 1][j] == 1){
                    grid[i - 1][j] = 2;
                    freshCount--;
                    q.add(new int[]{i - 1, j});
                    
                }
                if(j - 1 >= 0 && grid[i][j - 1] == 1){
                    grid[i][j - 1] = 2;
                    freshCount--;
                    q.add(new int[]{i, j - 1});
                    
                }
                if(i + 1 < n && grid[i + 1][j] == 1){
                    grid[i + 1][j] = 2;
                    freshCount--;
                    q.add(new int[]{i + 1, j});
                    
                }
                if(j + 1 < m && grid[i][j + 1] == 1){
                    grid[i][j + 1] = 2;
                    freshCount--;
                    q.add(new int[]{i, j + 1});
                    
                }
                
            }
            minutes++;
        }
        return freshCount == 0 ? minutes - 1 : -1;
    }
}