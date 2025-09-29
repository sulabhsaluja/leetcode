class Solution {
    public String finalString(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch != 'i') result.append(ch);
            else result.reverse();
            i++;
        }
        return result.toString();
    }
}