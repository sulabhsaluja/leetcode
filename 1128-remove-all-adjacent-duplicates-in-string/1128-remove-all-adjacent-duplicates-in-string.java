class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else st.push(ch);
        }
        StringBuilder result = new StringBuilder();
        for(char ch : st){
            result.append(ch);
        }
        return result.toString();
    }
}