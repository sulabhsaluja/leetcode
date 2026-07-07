class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(boxes.charAt(i) == '1') arr[i] = 1;
            else arr[i] = 0;
        }
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            int cnt = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[j] == 1 && j != i){
                    cnt += Math.abs(j - i);
                }
            }
            res[i] = cnt;
        }
        return res;
    }
}