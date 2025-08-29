class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int iIdx = 0;
        int DIdx = n;
        int[] res = new int[n + 1];

        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == 'I'){
                res[i] = iIdx;
                iIdx++;
            }
            else{
                res[i] = DIdx;
                DIdx--;
            }

        }
        res[n] = iIdx;
        return res;
    }
}