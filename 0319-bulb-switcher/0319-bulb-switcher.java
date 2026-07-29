class Solution {
    public int bulbSwitch(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return (int) Math.sqrt((double) n);
        }
    }
}