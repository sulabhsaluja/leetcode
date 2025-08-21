class Solution {
    public char findTheDifference(String s, String t) {
            char c = 0;
    for(int i = 0; i<t.length(); i++){
        c += t.charAt(i);
        if(i < (t.length()-1))
            c -= s.charAt(i);
    }
    return c;

    }
}