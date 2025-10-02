class Solution {
    public String getHint(String secret, String guess) {
        int x = 0;
        int y = 0;
        int[] secretFreq = new int[10];
        int[] guessFreq = new int[10];
        for(int i = 0 ; i < secret.length() ; i++){
            char sChar = secret.charAt(i);
            char gChar = guess.charAt(i);
            if(sChar == gChar) x++;
            else{
                secretFreq[sChar - '0']++;
                guessFreq[gChar - '0']++;
            }
            
        }
        for(int i = 0 ; i < 10 ; i++){
                y+=Math.min(secretFreq[i], guessFreq[i]);
            }
        return x + "A" + y + "B";
    }
}