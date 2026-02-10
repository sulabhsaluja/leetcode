class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (prefix[i] <= queries[q]) {
                    count = i + 1;
                } else {
                    break;
                }
            }
            result[q] = count;
        }

        return result;
    }
}
