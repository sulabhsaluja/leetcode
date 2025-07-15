class Solution {
    public static boolean isAlphaNumeric(String word){
        for(char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;
        }
        return true;
    }
    public static boolean isVowel(String word){
        String vowel  ="aeiouAEIOU";
        for(char ch : word.toCharArray()){
            if(vowel.indexOf(ch) != -1) return true;
        }
        return false;
    }
    public static boolean isConsonant(String word){
        String vowel = "aeiouAEIOU";
        for(char ch : word.toCharArray()){
            if(Character.isLetter(ch) && vowel.indexOf(ch) == -1) return true; 
        }
        return false;
    }
    public boolean isValid(String word) {
        return word.length() >= 3 && isVowel(word) && isConsonant(word) && isAlphaNumeric(word);
    }
}