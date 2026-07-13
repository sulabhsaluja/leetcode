class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String len = String.valueOf(high);
        int k = len.length();
        String str = "123456789";

        String minLen = String.valueOf(low);
        int m = minLen.length();
        for (int j = m; j <= k; j++) {
            for (int i = 0; i + j <= str.length(); i++) {
                int num = Integer.parseInt(str.substring(i, i + j));
                if (num >= low && num <= high)
                    ans.add(num);
            }
        }
        return ans;
    }
}