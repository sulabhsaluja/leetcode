class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int[] indexS = new int[256];
        // int[] indexT = new int[256];

        // for (int i = 0; i < s.length(); i++) {
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);

        //     if (indexS[ch1] != indexT[ch2]) return false;

        //     indexS[ch1] = i + 1;
        //     indexT[ch2] = i + 1;
        // }

        // return true;

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(map.containsKey(sChar)){
                if(map.get(sChar) != tChar) return false;
            }
            else if(map.containsValue(tChar)){
                return false;
            }
            else{
                map.put(sChar,tChar);
            }
        }

        return true;
    }
}
