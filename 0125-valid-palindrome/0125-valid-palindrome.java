class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                result.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int start = 0;
        int end = result.length() - 1;
        while(start < end){
            if(result.charAt(start) != result.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}