class Solution {
    public static void swapArr(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int left  = 0;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right]!=0){
                swapArr(nums,left,right);
                left++;
            }
        }
    }
}
