class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int ans = arr[0];

        for(int i = 1 ; i < n ; i++){
            if(arr[i] < 0){
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }
            maxEnding = Math.max(arr[i], maxEnding * arr[i]);
            minEnding = Math.min(arr[i], minEnding * arr[i]);
            ans = Math.max(ans, maxEnding);
        }
        return ans;
    }
}