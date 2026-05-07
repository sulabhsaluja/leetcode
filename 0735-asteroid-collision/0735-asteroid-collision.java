class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int asteroid : asteroids){
            while(!st.isEmpty() && asteroid < 0 && st.peek() > 0){
                if(Math.abs(asteroid) > st.peek()){
                    st.pop();
                    continue;
                }
                else if(Math.abs(asteroid) == st.peek()) st.pop();
                asteroid = 0;
                break;
            }
            if(asteroid != 0) st.push(asteroid);
        }
        int[] res = new int[st.size()];
        for(int i = res.length - 1 ; i >= 0 ; i--){
            res[i] = st.pop();
        }
        return res;
    }
}