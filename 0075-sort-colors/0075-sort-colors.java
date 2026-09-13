class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int idx = 0;
        int zeroC = 0;
        int oneC = 0;
        int twoC = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0) zeroC++;
            else if(arr[i] == 1) oneC++;
            else twoC++;
        }
        for(int i = 0 ; i < zeroC ; i++) arr[idx++] = 0;
        for(int i = 0 ; i < oneC ; i++) arr[idx++] = 1;
        for(int i = 0 ; i < twoC ; i++) arr[idx++] = 2;
    }
}