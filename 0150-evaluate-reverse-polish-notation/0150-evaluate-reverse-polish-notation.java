class Solution {
    public int evalRPN(String[] tokens) {
       int n = tokens.length;
       Stack<Integer> st = new Stack<>();
       for(int i = 0 ; i < n ; i++){
            String curr = tokens[i];
            if(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/") ){
                int first = st.pop();
                int second = st.pop();
                switch(curr){
                    case "+":
                            st.push(second + first);
                            break;
                        case "-":
                            st.push(second - first);
                            break;
                        case "*":
                            st.push(second * first);
                            break;
                        case "/":
                            st.push(second / first);
                            break;
                }
            }
            else{
                st.push(Integer.parseInt(curr));
            }
       }
       return st.pop(); 
    }
}