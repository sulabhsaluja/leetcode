class Solution {
    static long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long evenCount=(n+1)/2;
        long oddCount=n/2;

        long evenPart=power(5,evenCount);
        long oddPart=power(4,oddCount);
        return (int) ((evenPart*oddPart)%MOD);
    }
    private long power(long base,long exp){
        if(exp==0) return 1;
        long half=power(base,exp/2);
        if(exp%2==0){
            return (half*half)%MOD;
        }else{
            return (base*half%MOD*half%MOD)%MOD;
        }
    }
}