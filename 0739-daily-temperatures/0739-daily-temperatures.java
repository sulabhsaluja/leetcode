class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[t.length];
        int n = t.length;
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && t[st.peek()] < t[i]){
                int pop = st.pop(); //pop will return the smaller element's index whereas 'i' is the current element's index
                int diff = i - pop;
                res[pop] = diff; //smaller index value is now the difference
            }
            st.push(i);
        }
        return res;
    }
}