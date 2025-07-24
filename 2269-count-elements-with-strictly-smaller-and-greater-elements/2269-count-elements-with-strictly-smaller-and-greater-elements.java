class Solution {
    public int countElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        if (min == max) return 0;
        int count = 0;
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }
        return count;
    }
}