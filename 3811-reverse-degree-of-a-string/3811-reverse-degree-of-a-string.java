class Solution {
    public int reverseDegree(String s) {
        int deg = 0;
        for(int i = 0 ; i < s.length() ; i++){
            deg += (i+1) * (97 + 26 - (int) s.charAt(i));
        }
        return deg;
    }
}