class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            maxLen = Math.max(maxLen, getMaxLength(s, k, ch));
        }

        return maxLen;
    }
    
    private int getMaxLength(String s, int k, char target){
        int start = 0;
        int maxLen = 0;
        int rem = k;
        for(int end = 0; end < s.length() ; end++){
            if(s.charAt(end) != target) rem--;
            while(rem < 0){
                if(s.charAt(start) != target){
                    rem++;
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}