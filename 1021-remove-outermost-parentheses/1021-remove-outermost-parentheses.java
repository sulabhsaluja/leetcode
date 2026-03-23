class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(cnt > 0){
                    res.append(ch);
                }
                cnt++;
            }
            else{
                cnt--;
                if(cnt > 0){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}