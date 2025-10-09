public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = potions.length;
        int[] res = new int[spells.length];
        
        for (int i = 0; i < spells.length; i++) {
            int idx = findMinIndex(spells[i], potions, success);
            res[i] = m - idx;
        }
        
        return res;
    }
    
    private int findMinIndex(int spell, int[] potions, long success) {
        int left = 0, right = potions.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) spell * potions[mid] >= success) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
