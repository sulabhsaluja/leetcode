class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] >= prices[i]) {
                int index = st.pop();
                res[index] = prices[index] - prices[i];
            }
            st.push(i);
        }
        // For remaining elements in stack (no discount found)
        while (!st.isEmpty()) {
            int index = st.pop();
            res[index] = prices[index];
        }
        return res;
    }
}
