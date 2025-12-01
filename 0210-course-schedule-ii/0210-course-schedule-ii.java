class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[numCourses];

        // ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++){
            adj.add(new ArrayList<>());
        }
        int[] indeg = new int[numCourses];
        for(int[] p : prerequisites){
            int course = p[0];
            int prereq = p[1];
            indeg[course]++;
            adj.get(prereq).add(course);
        }


        for(int i = 0 ; i < numCourses ; i++){
            if(indeg[i] == 0) q.add(i);
        }

        int idx = 0;

        while(!q.isEmpty()){
            
            int top = q.poll();
            ans[idx++] = top;

            for(int nbr : adj.get(top)){
                indeg[nbr]--;
                if(indeg[nbr] == 0) q.add(nbr);
            }
        }

        return idx == numCourses ? ans : new int[]{}; 
        
    }
}