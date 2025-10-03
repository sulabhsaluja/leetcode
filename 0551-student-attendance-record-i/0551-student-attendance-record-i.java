class Solution {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        String late = "LLL";
        if(s.indexOf(late) != -1) return false;
        int absCnt = 0;
        for(char ch : chars){
            if(ch == 'A') absCnt++;
        }
        if(absCnt > 1) return false;

        else return true;

    }
}