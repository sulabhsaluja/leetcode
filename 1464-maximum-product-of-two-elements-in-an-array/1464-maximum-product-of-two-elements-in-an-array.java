class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = findMax(nums);
        int secondMax = findSecMax(nums);
        return (max - 1) * (secondMax - 1);

    }
    public static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num : nums) if(num > max) max = num;
        return max;
    }
    public static int findSecMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int a : arr){
            if(a >= max){
                secondMax = max;
                max = a;
            }
            else if(a > secondMax && a < max) secondMax = a;
        }
        return secondMax;
    }
}