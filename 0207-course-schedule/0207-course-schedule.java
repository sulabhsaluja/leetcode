class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i++){
            adj.add(new ArrayList<>());
        }
        int[] indeg = new int[numCourses];
        for(int[] p : prerequisites){
            int course = p[0];
            int prereq = p[1];
            adj.get(prereq).add(course);
            indeg[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        for(int i = 0 ; i < numCourses ; i++){
            if(indeg[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int top = q.poll();
            cnt++;

            for(int i : adj.get(top)){
                indeg[i]--;
                if(indeg[i] == 0) q.add(i);
                
            }
        }
        return cnt == numCourses;
    }
}