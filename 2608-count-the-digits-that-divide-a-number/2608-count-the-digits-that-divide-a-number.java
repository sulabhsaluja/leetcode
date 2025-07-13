class Solution {
    public int countDigits(int num) {
        int res = 0;
        int original = num;
        while(num != 0){
            if(original%(num%10) == 0) res++;
            num/=10;
        }
        return res;
    }
}