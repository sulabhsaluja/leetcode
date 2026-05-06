class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        int[] freqArr = new int[128];
        for(char ch : s.toCharArray()){
            freqArr[ch]++;
        }
        for(int i = 0 ; i < 128 ; i++){
            int val = freqArr[i];
            res += (val / 2) * 2;
            if(res % 2 == 0 && val % 2 == 1) res++;
        }
        return res;
    }
}