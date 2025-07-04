class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        
        for(int i = 0 ; i < words.length ; i++){
            StringBuilder sb = new StringBuilder();
            char first = words[i].charAt(0);
            if(first=='a' || first=='e' || first=='i' ||first=='o' ||first=='u' ||first=='A' ||first=='E' ||first=='I' ||first=='O' ||first=='U'){
                sb.append(words[i]);
            }
            else{
                sb.append(words[i].substring(1));
                sb.append(first);
            }
            sb.append("ma");

            
            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }
            words[i] = sb.toString();
        }
        // Join the words with spaces
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
}