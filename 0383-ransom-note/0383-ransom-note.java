class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0 ; i < n ; i++){
            freq1[ransomNote.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < m ; i++){
            freq2[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq2[i] < freq1[i]) return false;
        }
        return true;
    }
}