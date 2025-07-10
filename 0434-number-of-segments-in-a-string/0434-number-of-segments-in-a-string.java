class Solution {
    public int countSegments(String s) {
        int cnt = 0;
        String[] words = s.split(" ");
        for(String word : words){
            if(!word.isEmpty()) cnt++;
        }
        return cnt;
    }
}