class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : stones.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for(char ch : jewels.toCharArray()){
            count += mp.getOrDefault(ch, 0);
        }
        return count;
    }
}