class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int cnt = 0;
        int maxLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        for(int i = 0 ; i < maxLen ; i++){
            if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) cnt++;
            else break;
        }
        int total = (s1.length() - cnt) + (s2.length() - cnt) + (s3.length() - cnt);
        return cnt == 0 ? -1 : total;
    }
}