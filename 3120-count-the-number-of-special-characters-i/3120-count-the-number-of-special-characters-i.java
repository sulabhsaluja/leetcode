class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        int[] sFreq = new int[26];
        int[] lFreq = new int[26];
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') sFreq[ch - 'a']++;
            else lFreq[ch - 'A']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(sFreq[i] >= 1 && lFreq[i] >= 1) cnt++;
        }
        return cnt;
    }
}