class Solution {
    public long minimumSteps(String s) {
        int i = 0;
        long cnt = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == '0') i++;
            else if(s.charAt(j) == '1') j--;
            else{
                cnt+= j - i;
                i++;
                j--;
            }
        }
        return cnt;
    }
}