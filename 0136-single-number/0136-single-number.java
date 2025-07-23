class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int arrSum = 0;
        for(int num : nums){
            set.add(num);
            arrSum+=num;
        }
        int setSum = 0;
        Iterator it = set.iterator();
        while(it.hasNext()){
            setSum+=(int)it.next();
        }
        return (2 * setSum) - arrSum;

    }
}