class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = 0 ; i < words.length ; i++){
            if(i < words.length - 1) res.append(reverse(words[i]) + " ");
            else res.append(reverse(words[i]));
        }
        return res.toString();
    }
    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}