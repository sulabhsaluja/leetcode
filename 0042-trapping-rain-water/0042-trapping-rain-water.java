class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int lmax = 0;
        int rmax = 0;
        int res = 0;
        while(l < r){
            if(height[l] <= height[r]){
                if(lmax > height[l]){
                    res += lmax - height[l];
                }else{
                    lmax = height[l];
                }
                l++;
            }else{
                if(rmax > height[r]){
                    res += rmax - height[r];
                }else{
                    rmax = height[r];
                }
                r--;
            }
        }
        return res;
    }
}