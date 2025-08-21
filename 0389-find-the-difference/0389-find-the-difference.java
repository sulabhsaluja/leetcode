class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            sSum+=ch;
        }
        for(int i = 0 ; i < t.length() ; i++) {
            char ch = t.charAt(i);
            tSum+=ch;
        }

        return (char)(tSum - sSum);
    }
}