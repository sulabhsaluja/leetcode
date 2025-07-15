class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        HashSet<Character> seen = new HashSet<>();
        while(right < n){
            if(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            else{
                seen.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
    }
}