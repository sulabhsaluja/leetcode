class Solution {
    public void reverseString(char[] s) {
        int start = 0 ;
        int end = s.length-1 ; 
        while(start < end){
            char curr = s[start];
            s[start] = s[end];
            s[end] = curr;

            start++;
            end--;
        }
    }
}